    package main;
    /**
     * User: Bogdan
     */

    import com.sun.jersey.api.container.grizzly2.GrizzlyWebContainerFactory;
    import org.glassfish.grizzly.http.server.HttpServer;
    import text.Messages;
    import text.Props;

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
            initParams.put("com.sun.jersey.config.property.packages", "rest");
            initParams.put("com.sun.jersey.api.json.POJOMappingFeature", "true");
            return GrizzlyWebContainerFactory.create(BASE_URI, initParams);
        }

        public static void main(String[] args) throws IOException, java.text.ParseException {

                    getBaseURI(Props.SERVER_PORT);
                    final HttpServer httpServer = startServer();
                    System.out.println(Messages.STARTING_GRIZZLY + BASE_URI);
                    System.in.read();
                    httpServer.stop();
        }
    }
