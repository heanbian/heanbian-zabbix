package com.heanbian.block.zabbix;

public class ZabbixRequest<T> {

	private String jsonrpc = "2.0";

	private String method;

	private T params;

	private int id = 1;

	private String auth;

	public ZabbixRequest() {
		super();
	}

	public ZabbixRequest(String method, T params, String auth) {
		this("2.0", method, params, 1, auth);
	}

	public ZabbixRequest(String jsonrpc, String method, T params, int id, String auth) {
		super();
		this.jsonrpc = jsonrpc;
		this.method = method;
		this.params = params;
		this.id = id;
		this.auth = auth;
	}

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
