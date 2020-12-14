package com.heanbian.block.zabbix.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ZabbixPreprocessing {

	private String type;

	private String params;

	private String errorHandler;

	private String errorHandlerParams;

	public String getType() {
		return type;
	}

	public ZabbixPreprocessing setType(String type) {
		this.type = type;
		return this;
	}

	public String getParams() {
		return params;
	}

	public ZabbixPreprocessing setParams(String params) {
		this.params = params;
		return this;
	}

	public String getErrorHandler() {
		return errorHandler;
	}

	public ZabbixPreprocessing setErrorHandler(String errorHandler) {
		this.errorHandler = errorHandler;
		return this;
	}

	public String getErrorHandlerParams() {
		return errorHandlerParams;
	}

	public ZabbixPreprocessing setErrorHandlerParams(String errorHandlerParams) {
		this.errorHandlerParams = errorHandlerParams;
		return this;
	}

}
