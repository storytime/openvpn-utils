package utils.text;

/**
 * User: Bogdan
 */

//client disconnect params
public interface CDS {
    final static String TABLE_NAME="client_disconnect";
    final static String ID = "id";
    final static String COMMON_NAME = "common_name";
    final static String BYTES_RECEIVED = "bytes_received";
    final static String BYTES_SENT = "bytes_sent";
    final static String SESSION_TIME = "session_time";
    final static String TRUSTED_IP = "trusted_ip";
    final static String TRUSTED_PORT = "trusted_port";
    final static String IFCONFIG_POOL_LOCAL_IP = "ifconfig_pool_local_ip";
    final static String IFCONFIG_POOL_REMOTE_IP = "ifconfig_pool_remote_ip";
    final static String CONFIG = "config";
    final static String DAEMON = "daemon";
    final static String DAEMON_LOG_REDIRECT = "daemon_log_redirect";
    final static String DEV = "dev";
    final static String IFCONFIG_LOCAL = "ifconfig_local";
    final static String IFCONFIG_REMOTE = "ifconfig_remote";
    final static String LINK_MTU = "link_mtu";
    final static String ROUTE_NET_GATEWAY = "route_net_gateway";
    final static String ROUTE_VPN_GATEWAY = "route_vpn_gateway";
    final static String TUN_MTU = "untrusted_ip";
    final static String UNTRUSTED_IP = "tun_mtu";
    final static String UNTRUSTED_PORT = "untrusted_port";
    final static String TIME_DURATION = "time_duration"; //The duration (in seconds) of the client session which is now disconnecting.
    final static String TIME_UNIX = "time_unix"; //Client connection timestamp, formatted as a unix integer date/time value
}
