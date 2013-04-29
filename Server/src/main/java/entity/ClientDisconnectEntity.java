package entity;
/**
 * User: Bogdan
 */

import utils.text.CDS;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@javax.persistence.Table(name = "client_disconnect", schema = "", catalog = "")
@Entity
public class ClientDisconnectEntity implements Client {
    @Id
    @javax.persistence.Column(name = CDS.ID)
    @GeneratedValue
    protected Integer id;

    @javax.persistence.Column(name = CDS.COMMON_NAME)
    @Basic
    private String commonName;

    @javax.persistence.Column(name = CDS.BYTES_RECEIVED)
    @Basic
    private String bytesReceived;

    @javax.persistence.Column(name = CDS.BYTES_SENT)
    @Basic
    private String bytesSent;

    @javax.persistence.Column(name = CDS.SESSION_TIME)
    @Basic
    private String sessionTime;

    @javax.persistence.Column(name = CDS.TRUSTED_IP)
    @Basic
    private String trustedIp;

    @javax.persistence.Column(name = CDS.TRUSTED_PORT)
    @Basic
    private String trustedPort;

    @javax.persistence.Column(name = CDS.IFCONFIG_POOL_LOCAL_IP)
    @Basic
    private String ifconfigPoolLocalIp;

    @javax.persistence.Column(name = CDS.IFCONFIG_POOL_REMOTE_IP)
    @Basic
    private String ifconfigPoolRemoteIp;

    @javax.persistence.Column(name = CDS.CONFIG)
    @Basic
    private String config;

    @javax.persistence.Column(name = CDS.DAEMON)
    @Basic
    private String daemon;

    @javax.persistence.Column(name = CDS.DAEMON_LOG_REDIRECT)
    @Basic
    private String daemonLogRedirect;

    @javax.persistence.Column(name = CDS.DEV)
    @Basic
    private String dev;

    @javax.persistence.Column(name = CDS.IFCONFIG_LOCAL)
    @Basic
    private String ifconfigLocal;

    @javax.persistence.Column(name = CDS.IFCONFIG_REMOTE)
    @Basic
    private String ifconfigRemote;

    @javax.persistence.Column(name = CDS.LINK_MTU)
    @Basic
    private String linkMtu;

    @javax.persistence.Column(name = CDS.ROUTE_NET_GATEWAY)
    @Basic
    private String routeNetGateway;

    @javax.persistence.Column(name = CDS.ROUTE_VPN_GATEWAY)
    @Basic
    private String routeVpnGateway;

    @javax.persistence.Column(name = CDS.TUN_MTU)
    @Basic
    private String tunMtu;

    @javax.persistence.Column(name = CDS.UNTRUSTED_IP)
    @Basic
    private String untrustedIp;

    @javax.persistence.Column(name = CDS.UNTRUSTED_PORT)
    @Basic
    private String untrustedPort;

    @javax.persistence.Column(name = CDS.TIME_DURATION)
    @Basic
    private String timeDuration;

    @javax.persistence.Column(name = CDS.TIME_UNIX)
    @Basic
    private String timeUnix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommonName() {
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


    public String getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(String bytesSent) {
        this.bytesSent = bytesSent;
    }


    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }


    public String getTrustedIp() {
        return trustedIp;
    }

    public void setTrustedIp(String trustedIp) {
        this.trustedIp = trustedIp;
    }

    public String getTrustedPort() {
        return trustedPort;
    }

    public void setTrustedPort(String trustedPort) {
        this.trustedPort = trustedPort;
    }

    public String getIfconfigPoolLocalIp() {
        return ifconfigPoolLocalIp;
    }

    public void setIfconfigPoolLocalIp(String ifconfigPoolLocalIp) {
        this.ifconfigPoolLocalIp = ifconfigPoolLocalIp;
    }

    public String getIfconfigPoolRemoteIp() {
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

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getIfconfigLocal() {
        return ifconfigLocal;
    }

    public void setIfconfigLocal(String ifconfigLocal) {
        this.ifconfigLocal = ifconfigLocal;
    }

    public String getIfconfigRemote() {
        return ifconfigRemote;
    }

    public void setIfconfigRemote(String ifconfigRemote) {
        this.ifconfigRemote = ifconfigRemote;
    }

    public String getLinkMtu() {
        return linkMtu;
    }

    public void setLinkMtu(String linkMtu) {
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

    public String getTunMtu() {
        return tunMtu;
    }

    public void setTunMtu(String tunMtu) {
        this.tunMtu = tunMtu;
    }

    public String getUntrustedIp() {
        return untrustedIp;
    }

    public void setUntrustedIp(String untrustedIp) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientDisconnectEntity that = (ClientDisconnectEntity) o;

        if (bytesReceived != null ? !bytesReceived.equals(that.bytesReceived) : that.bytesReceived != null)
            return false;
        if (bytesSent != null ? !bytesSent.equals(that.bytesSent) : that.bytesSent != null) return false;
        if (commonName != null ? !commonName.equals(that.commonName) : that.commonName != null) return false;
        if (config != null ? !config.equals(that.config) : that.config != null) return false;
        if (daemon != null ? !daemon.equals(that.daemon) : that.daemon != null) return false;
        if (daemonLogRedirect != null ? !daemonLogRedirect.equals(that.daemonLogRedirect) : that.daemonLogRedirect != null)
            return false;
        if (dev != null ? !dev.equals(that.dev) : that.dev != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ifconfigLocal != null ? !ifconfigLocal.equals(that.ifconfigLocal) : that.ifconfigLocal != null)
            return false;
        if (ifconfigPoolLocalIp != null ? !ifconfigPoolLocalIp.equals(that.ifconfigPoolLocalIp) : that.ifconfigPoolLocalIp != null)
            return false;
        if (ifconfigPoolRemoteIp != null ? !ifconfigPoolRemoteIp.equals(that.ifconfigPoolRemoteIp) : that.ifconfigPoolRemoteIp != null)
            return false;
        if (ifconfigRemote != null ? !ifconfigRemote.equals(that.ifconfigRemote) : that.ifconfigRemote != null)
            return false;
        if (linkMtu != null ? !linkMtu.equals(that.linkMtu) : that.linkMtu != null) return false;
        if (routeNetGateway != null ? !routeNetGateway.equals(that.routeNetGateway) : that.routeNetGateway != null)
            return false;
        if (routeVpnGateway != null ? !routeVpnGateway.equals(that.routeVpnGateway) : that.routeVpnGateway != null)
            return false;
        if (sessionTime != null ? !sessionTime.equals(that.sessionTime) : that.sessionTime != null) return false;
        if (timeDuration != null ? !timeDuration.equals(that.timeDuration) : that.timeDuration != null) return false;
        if (timeUnix != null ? !timeUnix.equals(that.timeUnix) : that.timeUnix != null) return false;
        if (trustedIp != null ? !trustedIp.equals(that.trustedIp) : that.trustedIp != null) return false;
        if (trustedPort != null ? !trustedPort.equals(that.trustedPort) : that.trustedPort != null) return false;
        if (tunMtu != null ? !tunMtu.equals(that.tunMtu) : that.tunMtu != null) return false;
        if (untrustedIp != null ? !untrustedIp.equals(that.untrustedIp) : that.untrustedIp != null) return false;
        if (untrustedPort != null ? !untrustedPort.equals(that.untrustedPort) : that.untrustedPort != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commonName != null ? commonName.hashCode() : 0);
        result = 31 * result + (bytesReceived != null ? bytesReceived.hashCode() : 0);
        result = 31 * result + (bytesSent != null ? bytesSent.hashCode() : 0);
        result = 31 * result + (sessionTime != null ? sessionTime.hashCode() : 0);
        result = 31 * result + (trustedIp != null ? trustedIp.hashCode() : 0);
        result = 31 * result + (trustedPort != null ? trustedPort.hashCode() : 0);
        result = 31 * result + (ifconfigPoolLocalIp != null ? ifconfigPoolLocalIp.hashCode() : 0);
        result = 31 * result + (ifconfigPoolRemoteIp != null ? ifconfigPoolRemoteIp.hashCode() : 0);
        result = 31 * result + (config != null ? config.hashCode() : 0);
        result = 31 * result + (daemon != null ? daemon.hashCode() : 0);
        result = 31 * result + (daemonLogRedirect != null ? daemonLogRedirect.hashCode() : 0);
        result = 31 * result + (dev != null ? dev.hashCode() : 0);
        result = 31 * result + (ifconfigLocal != null ? ifconfigLocal.hashCode() : 0);
        result = 31 * result + (ifconfigRemote != null ? ifconfigRemote.hashCode() : 0);
        result = 31 * result + (linkMtu != null ? linkMtu.hashCode() : 0);
        result = 31 * result + (routeNetGateway != null ? routeNetGateway.hashCode() : 0);
        result = 31 * result + (routeVpnGateway != null ? routeVpnGateway.hashCode() : 0);
        result = 31 * result + (tunMtu != null ? tunMtu.hashCode() : 0);
        result = 31 * result + (untrustedIp != null ? untrustedIp.hashCode() : 0);
        result = 31 * result + (untrustedPort != null ? untrustedPort.hashCode() : 0);
        result = 31 * result + (timeDuration != null ? timeDuration.hashCode() : 0);
        result = 31 * result + (timeUnix != null ? timeUnix.hashCode() : 0);
        return result;
    }
}
