package ar.com.gnuler.vpn.openvpn;

public interface IOpenVPNConfigFileInterpreter {

	public abstract String generateConfigFile(OpenVPNServer server);

}