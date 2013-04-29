package uitls.collectors;

import entity.ClientDisconnectEntity;
import uitls.text.CDS;

/**
 * User: Bogdan
 */
public class DefaultCollector implements Collector {
    private ClientDisconnectEntity clientDisconnect;

    @Override
    public ClientDisconnectEntity clientDisconnect() {
        clientDisconnect = new ClientDisconnectEntity();
        clientDisconnect.setCommonName(System.getenv(CDS.COMMON_NAME));
        clientDisconnect.setBytesReceived(System.getenv(CDS.BYTES_RECEIVED));
        clientDisconnect.setBytesSent(System.getenv(CDS.BYTES_SENT));
        clientDisconnect.setTrustedIp(System.getenv(CDS.TRUSTED_IP));
        clientDisconnect.setTrustedPort(System.getenv(CDS.TRUSTED_PORT));
        clientDisconnect.setIfconfigPoolLocalIp(System.getenv(CDS.IFCONFIG_POOL_LOCAL_IP));
        clientDisconnect.setIfconfigPoolRemoteIp(System.getenv(CDS.IFCONFIG_POOL_REMOTE_IP));
        clientDisconnect.setConfig(System.getenv(CDS.CONFIG));
        clientDisconnect.setDaemon(System.getenv(CDS.DAEMON));
        clientDisconnect.setDaemonLogRedirect(System.getenv(CDS.DAEMON_LOG_REDIRECT));
        clientDisconnect.setDev(System.getenv(CDS.DEV));
        clientDisconnect.setIfconfigLocal(System.getenv(CDS.IFCONFIG_LOCAL));
        clientDisconnect.setIfconfigRemote(System.getenv(CDS.IFCONFIG_REMOTE));
        clientDisconnect.setLinkMtu(System.getenv(CDS.LINK_MTU));
        clientDisconnect.setRouteNetGateway(System.getenv(CDS.ROUTE_NET_GATEWAY));
        clientDisconnect.setRouteVpnGateway(System.getenv(CDS.ROUTE_VPN_GATEWAY));
        clientDisconnect.setTunMtu(System.getenv(CDS.TUN_MTU));
        clientDisconnect.setUntrustedIp(System.getenv(CDS.UNTRUSTED_IP));
        clientDisconnect.setUntrustedPort(System.getenv(CDS.UNTRUSTED_PORT));
        clientDisconnect.setTimeDuration(System.getenv(CDS.TIME_DURATION));
        clientDisconnect.setTimeUnix(System.getenv(CDS.TIME_UNIX));

        //calculate session time

//        int t1 = Integer.valueOf(clientDisconnect.getTimeUnix());
//        int t2 = Integer.valueOf(clientDisconnect.getTimeUnix()) + Integer.valueOf(clientDisconnect.getTimeDuration());
//
//
//        DateTime dt1 = new DateTime(new java.util.Date((long) t1 * 1000));
//        DateTime dt2 = new DateTime(new java.util.Date((long) t2 * 1000));
//
//        String sessionTime = Days.daysBetween(dt1, dt2).getDays() + " days, " +
//                Hours.hoursBetween(dt1, dt2).getHours() % 24 + " hours, " +
//                Minutes.minutesBetween(dt1, dt2).getMinutes() % 60 + " minutes, " +
//                Seconds.secondsBetween(dt1, dt2).getSeconds() % 60 + " seconds.";
//
//        clientDisconnect.setSessionTime(sessionTime);
        return clientDisconnect;
    }
}
