package com.heanbian.block.zabbix;

public class ZabbixRequest<T> {

	private String jsonrpc;

	private String method;

	private T params;

	private int id;

	private String auth;

	public String getJsonrpc() {
		return jsonrpc;
	}

	public ZabbixRequest<T> setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
		return this;
	}

	public String getMethod() {
		return method;
	}

	public ZabbixRequest<T> setMethod(String method) {
		this.method = method;
		return this;
	}

	public T getParams() {
		return params;
	}

	public ZabbixRequest<T> setParams(T params) {
		this.params = params;
		return this;
	}

	public int getId() {
		return id;
	}

	public ZabbixRequest<T> setId(int id) {
		this.id = id;
		return this;
	}

	public String getAuth() {
		return auth;
	}

	public ZabbixRequest<T> setAuth(String auth) {
		this.auth = auth;
		return this;
	}

}
