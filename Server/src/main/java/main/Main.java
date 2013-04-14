package main;
/**
 * User: Bogdan
 */

import com.sun.jersey.api.container.grizzly2.GrizzlyWebContainerFactory;
import entity.ClientDisconnect;
import org.apache.commons.cli.*;
import org.glassfish.grizzly.http.server.HttpServer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.SessionFactorySingleton;
import utils.collectors.DefaultCollector;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class Main {

    private static Session session = null;
    private static Transaction tx = null;
    public static URI BASE_URI;

    private static void getBaseURI(int port) {
        BASE_URI = UriBuilder.fromUri("http://localhost/").port(getPort(port)).build();
    }

    private static int getPort(int defaultPort) {
        String port = System.getProperty("jersey.test.port");
        if (null != port) {
            try {
                return Integer.parseInt(port);
            } catch (NumberFormatException e) {
            }
        }
        return defaultPort;
    }


    protected static HttpServer startServer() throws IOException {
        final Map<String, String> initParams = new HashMap<String, String>();
        initParams.put("com.sun.jersey.config.property.packages", "rest");
        initParams.put("com.sun.jersey.api.json.POJOMappingFeature", "true");
        System.out.println("Starting grizzly...");

        return GrizzlyWebContainerFactory.create(BASE_URI, initParams);
    }

    public static void main(String[] args) throws IOException, java.text.ParseException {

        Options options = new Options();
       // options.addOption("d", false, "d");
        options.addOption("s", true, "sever mode [port]");

        //parse
        CommandLineParser parser = new BasicParser();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException pe) {
            usage(options);
            return;
        }

        //commands
        if (cmd.hasOption("d")) {
            //disconnect();
        }

        if (cmd.hasOption("s")) {
            if (cmd.getOptionValue('s') != null) {
                getBaseURI(Integer.parseInt(cmd.getOptionValue('s')));
                final HttpServer httpServer = startServer();
                System.out.println(String.format("Jersey app started with WADL available at " + "%sapplication.wadl\nTry out %shelloworld\nHit enter to stop it...", BASE_URI, BASE_URI));
                System.in.read();
                httpServer.stop();
            }
        }
    }

    private static void disconnect() throws java.text.ParseException {
        try {
            session = SessionFactorySingleton.getInstance().openSession();
            tx = session.beginTransaction();

            DefaultCollector df = new DefaultCollector();
            ClientDisconnect cl = df.clientDisconnect();

            session.save(cl);
            session.flush();
            tx.commit();

        } catch (Exception ex) {
            //rollback
            ex.printStackTrace();
            tx.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    private static void usage(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("CLIDemo", options);
    }
}
