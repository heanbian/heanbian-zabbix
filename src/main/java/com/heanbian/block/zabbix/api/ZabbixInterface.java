package com.heanbian.block.zabbix.api;

public class ZabbixInterface {

	/**
	 * 1 - agent;2 - SNMP;3 - IPMI;4 - JMX.
	 */
	private int type = 2;

	/**
	 * 0 - not default; 1 - default.
	 */
	private int main = 1;

	/**
	 * 0 - DNS;1 - IP
	 */
	private int useip = 1;

	private String ip;

	private String dns;

	private String port;

	private ZabbixInterfaceDetails details;

	public ZabbixInterface() {
		this.ip = "";
		this.dns = "";
	}

	public int getType() {
		return type;
	}

	public ZabbixInterface setType(int type) {
		this.type = type;
		return this;
	}

	public int getMain() {
		return main;
	}

	public ZabbixInterface setMain(int main) {
		this.main = main;
		return this;
	}

	public int getUseip() {
		return useip;
	}

	public ZabbixInterface setUseip(int useip) {
		this.useip = useip;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public ZabbixInterface setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getDns() {
		return dns;
	}

	public ZabbixInterface setDns(String dns) {
		this.dns = dns;
		return this;
	}

	public String getPort() {
		return port;
	}

	public ZabbixInterface setPort(String port) {
		this.port = port;
		return this;
	}

	public ZabbixInterfaceDetails getDetails() {
		return details;
	}

	public ZabbixInterface setDetails(ZabbixInterfaceDetails details) {
		this.details = details;
		return this;
	}

}
