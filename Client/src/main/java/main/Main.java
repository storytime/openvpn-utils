package main;
/**
 * User: Bogdan
 */

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import entity.ClientDisconnect;
import org.apache.commons.cli.*;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class Main {
    private static String port;
    private static String host;

    public static void main(String[] args) throws IOException, java.text.ParseException {


        Options options = new Options();
        options.addOption("d", false, "d");
        options.addOption("h", true, "sever mode [port]");
        options.addOption("p", true, "port");

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

        }

        if (cmd.hasOption("p")) {
            if (cmd.getOptionValue('p') != null) {
                port = cmd.getOptionValue('p');
            }
        }


        if (cmd.hasOption("h")) {
            if (cmd.getOptionValue('h') != null) {

                host = cmd.getOptionValue('h');
                ClientDisconnect clientDisconnect = new ClientDisconnect();
                clientDisconnect.setCommonName("test");
                try {
                    String res = "http://" + host + ":" + port + "/rest/client";
                    System.out.println(res);
                    Client client = Client.create();
                    WebResource webResource = client.resource(res);

                    ObjectMapper mapper = new ObjectMapper();
                    ClientResponse response = webResource.type("application/json").post(ClientResponse.class, mapper.writeValueAsString(clientDisconnect));

                    if (response.getStatus() != 200) {
                        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private static void usage(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("CLIDemo", options);
    }
}
