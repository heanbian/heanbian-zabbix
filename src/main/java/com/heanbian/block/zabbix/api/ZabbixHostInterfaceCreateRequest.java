package com.heanbian.block.zabbix.api;

public class ZabbixHostInterfaceCreateRequest {

	private String hostid;

	private String dns;

	private String ip;

	private String port;

	private int main;

	private int type;

	private int useip;

	public ZabbixHostInterfaceCreateRequest() {
		this.ip = "";
		this.dns = "";
	}

	public String getHostid() {
		return hostid;
	}

	public ZabbixHostInterfaceCreateRequest setHostid(String hostid) {
		this.hostid = hostid;
		return this;
	}

	public int getType() {
		return type;
	}

	public ZabbixHostInterfaceCreateRequest setType(int type) {
		this.type = type;
		return this;
	}

	public int getMain() {
		return main;
	}

	public ZabbixHostInterfaceCreateRequest setMain(int main) {
		this.main = main;
		return this;
	}

	public int getUseip() {
		return useip;
	}

	public ZabbixHostInterfaceCreateRequest setUseip(int useip) {
		this.useip = useip;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public ZabbixHostInterfaceCreateRequest setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getDns() {
		return dns;
	}

	public ZabbixHostInterfaceCreateRequest setDns(String dns) {
		this.dns = dns;
		return this;
	}

	public String getPort() {
		return port;
	}

	public ZabbixHostInterfaceCreateRequest setPort(String port) {
		this.port = port;
		return this;
	}

}
