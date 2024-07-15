package com.heanbian.block.zabbix;

public class ZabbixException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ZabbixException(String message) {
		super(message);
	}

	public ZabbixException(String message, Throwable cause) {
		super(message, cause);
	}

	public ZabbixException(Throwable cause) {
		super(cause);
	}

}
