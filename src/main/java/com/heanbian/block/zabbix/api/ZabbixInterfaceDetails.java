package com.heanbian.block.zabbix.api;

public class ZabbixInterfaceDetails {

	/**
	 * 1 - SNMPv1;2 - (default) - SNMPv2c;3 - SNMPv3
	 */
	private int version = 2;

	/**
	 * 0 - don't use bulk requests; 1 - (default) - use bulk requests.
	 */
	private int bulk = 1;
	private String community = "public";

	// Only by SNMPv3
	private String securityname;
	private int securitylevel;
	private String authpassphrase;
	private String privpassphrase;
	private int authprotocol;
	private int privprotocol;
	private String contextname;

	public int getVersion() {
		return version;
	}

	public ZabbixInterfaceDetails setVersion(int version) {
		this.version = version;
		return this;
	}

	public int getBulk() {
		return bulk;
	}

	public ZabbixInterfaceDetails setBulk(int bulk) {
		this.bulk = bulk;
		return this;
	}

	public String getSecurityname() {
		return securityname;
	}

	public ZabbixInterfaceDetails setSecurityname(String securityname) {
		this.securityname = securityname;
		return this;
	}

	public String getContextname() {
		return contextname;
	}

	public ZabbixInterfaceDetails setContextname(String contextname) {
		this.contextname = contextname;
		return this;
	}

	public int getSecuritylevel() {
		return securitylevel;
	}

	public ZabbixInterfaceDetails setSecuritylevel(int securitylevel) {
		this.securitylevel = securitylevel;
		return this;
	}

	public String getCommunity() {
		return community;
	}

	public ZabbixInterfaceDetails setCommunity(String community) {
		this.community = community;
		return this;
	}

	public String getAuthpassphrase() {
		return authpassphrase;
	}

	public ZabbixInterfaceDetails setAuthpassphrase(String authpassphrase) {
		this.authpassphrase = authpassphrase;
		return this;
	}

	public String getPrivpassphrase() {
		return privpassphrase;
	}

	public ZabbixInterfaceDetails setPrivpassphrase(String privpassphrase) {
		this.privpassphrase = privpassphrase;
		return this;
	}

	public int getAuthprotocol() {
		return authprotocol;
	}

	public ZabbixInterfaceDetails setAuthprotocol(int authprotocol) {
		this.authprotocol = authprotocol;
		return this;
	}

	public int getPrivprotocol() {
		return privprotocol;
	}

	public ZabbixInterfaceDetails setPrivprotocol(int privprotocol) {
		this.privprotocol = privprotocol;
		return this;
	}

}
