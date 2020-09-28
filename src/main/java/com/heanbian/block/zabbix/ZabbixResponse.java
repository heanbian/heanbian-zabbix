package com.heanbian.block.zabbix;

public class ZabbixResponse<T> {

	private String jsonrpc;

	private ZabbixError<String> error;

	private T result;

	private int id;

	public String getJsonrpc() {
		return jsonrpc;
	}

	public ZabbixResponse<T> setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
		return this;
	}

	public ZabbixError<String> getError() {
		return error;
	}

	public ZabbixResponse<T> setError(ZabbixError<String> error) {
		this.error = error;
		return this;
	}

	public T getResult() {
		return result;
	}

	public ZabbixResponse<T> setResult(T result) {
		this.result = result;
		return this;
	}

	public int getId() {
		return id;
	}

	public ZabbixResponse<T> setId(int id) {
		this.id = id;
		return this;
	}

}
