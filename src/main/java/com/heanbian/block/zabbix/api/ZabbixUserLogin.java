package com.heanbian.block.zabbix.api;

public class ZabbixUserLogin {

	private String username;

	private String password;

	public ZabbixUserLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
