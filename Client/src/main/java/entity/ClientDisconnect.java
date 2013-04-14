package entity;
/**
 * User: Bogdan
 */
public class ClientDisconnect implements Client {
    protected Integer id;

    private String commonName;

    private String bytesReceived;

    private String bytesSent;

    private String sessionTime;

    private String trustedIp;

    private String trustedPort;

    private String ifconfigPoolLocalIp;

    private String ifconfigPoolRemoteIp;

    private String config;

    private String daemon;

    private String daemonLogRedirect;

    private String dev;

    private String ifconfigLocal;

    private String ifconfigRemote;

    private String linkMtu;

    private String routeNetGateway;

    private String routeVpnGateway;

    private String tunMtu;

    private String untrustedIp;

    private String untrustedPort;

    private String timeDuration;

    private String timeUnix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getBytesReceived() {
        return bytesReceived;
    }

    public void setBytesReceived(String bytesReceived) {
        this.bytesReceived = bytesReceived;
    }


    public  String getBytesSent() {
        return bytesSent;
    }

    public  void setBytesSent(String bytesSent) {
        this.bytesSent = bytesSent;
    }


    public  String getSessionTime() {
        return sessionTime;
    }

    public  void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }


    public  String getTrustedIp() {
        return trustedIp;
    }

    public  void setTrustedIp(String trustedIp) {
        this.trustedIp = trustedIp;
    }

    public  String getTrustedPort() {
        return trustedPort;
    }

    public  void setTrustedPort(String trustedPort) {
        this.trustedPort = trustedPort;
    }

    public String getIfconfigPoolLocalIp() {
        return ifconfigPoolLocalIp;
    }

    public void setIfconfigPoolLocalIp(String ifconfigPoolLocalIp) {
        this.ifconfigPoolLocalIp = ifconfigPoolLocalIp;
    }

    public  String getIfconfigPoolRemoteIp() {
        return ifconfigPoolRemoteIp;
    }

    public void setIfconfigPoolRemoteIp(String ifconfigPoolRemoteIp) {
        this.ifconfigPoolRemoteIp = ifconfigPoolRemoteIp;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getDaemon() {
        return daemon;
    }

    public void setDaemon(String daemon) {
        this.daemon = daemon;
    }

    public String getDaemonLogRedirect() {
        return daemonLogRedirect;
    }

    public void setDaemonLogRedirect(String daemonLogRedirect) {
        this.daemonLogRedirect = daemonLogRedirect;
    }

    public  String getDev() {
        return dev;
    }

    public  void setDev(String dev) {
        this.dev = dev;
    }

    public  String getIfconfigLocal() {
        return ifconfigLocal;
    }

    public void setIfconfigLocal(String ifconfigLocal) {
        this.ifconfigLocal = ifconfigLocal;
    }

    public  String getIfconfigRemote() {
        return ifconfigRemote;
    }

    public void setIfconfigRemote(String ifconfigRemote) {
        this.ifconfigRemote = ifconfigRemote;
    }

    public String getLinkMtu() {
        return linkMtu;
    }

    public  void setLinkMtu(String linkMtu) {
        this.linkMtu = linkMtu;
    }

    public String getRouteNetGateway() {
        return routeNetGateway;
    }

    public void setRouteNetGateway(String routeNetGateway) {
        this.routeNetGateway = routeNetGateway;
    }

    public String getRouteVpnGateway() {
        return routeVpnGateway;
    }

    public void setRouteVpnGateway(String routeVpnGateway) {
        this.routeVpnGateway = routeVpnGateway;
    }

    public  String getTunMtu() {
        return tunMtu;
    }

    public  void setTunMtu(String tunMtu) {
        this.tunMtu = tunMtu;
    }

    public  String getUntrustedIp() {
        return untrustedIp;
    }

    public  void setUntrustedIp(String untrustedIp) {
        this.untrustedIp = untrustedIp;
    }

    public String getUntrustedPort() {
        return untrustedPort;
    }

    public void setUntrustedPort(String untrustedPort) {
        this.untrustedPort = untrustedPort;
    }

    public String getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
    }

    public String getTimeUnix() {
        return timeUnix;
    }

    public void setTimeUnix(String timeUnix) {
        this.timeUnix = timeUnix;
    }
}
