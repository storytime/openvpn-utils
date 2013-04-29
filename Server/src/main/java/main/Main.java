package main;
/**
 * User: Bogdan
 */

import com.sun.jersey.api.container.grizzly2.GrizzlyWebContainerFactory;
import org.apache.commons.cli.*;
import org.glassfish.grizzly.http.server.HttpServer;
import utils.text.Messages;
import utils.text.Props;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static URI BASE_URI;

    private static void getBaseURI(int port) {
        BASE_URI = UriBuilder.fromUri(Props.BASE_URL).port(getPort(port)).build();
    }

    private static int getPort(int defaultPort) {
        String port = System.getProperty(Props.JERSEY_TEST_PORT);
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
        initParams.put(Props.JERSEY_PROP_PACKAGE, Props.REST_PACKAGE);
        initParams.put(Props.JERSEY_POJO, Props.TRUE);
        return GrizzlyWebContainerFactory.create(BASE_URI, initParams);
    }

    public static void main(String[] args) throws IOException, java.text.ParseException {

        Options options = new Options();
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

        if (cmd.hasOption("s")) {
            if (cmd.getOptionValue('s') != null) {
                getBaseURI(Integer.parseInt(cmd.getOptionValue('s')));
                final HttpServer httpServer = startServer();
                System.out.println(Messages.STARTING_GRIZZLY + BASE_URI);
                System.in.read();
                httpServer.stop();
            }
        }
    }

    private static void usage(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("see the examples", options);
    }
}
