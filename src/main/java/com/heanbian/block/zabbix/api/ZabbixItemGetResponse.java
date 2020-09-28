package com.heanbian.block.zabbix.api;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ZabbixItemGetResponse {

	private String itemid;
	private String type;
	private String snmpOid;
	private String hostid;
	private String name;
	private String key_;
	private String delay;
	private String history;
	private String trends;
	private String status;
	private String valueType;
	private String trapperHosts;
	private String units;
	private String formula;
	private String logtimefmt;
	private String templateid;
	private String valuemapid;
	private String params;
	private String ipmiSensor;
	private String authtype;
	private String username;
	private String password;
	private String publickey;
	private String privatekey;
	private String flags;
	private String interfaceid;
	private String description;
	private String inventoryLink;
	private String lifetime;
	private String evaltype;
	private String jmxEndpoint;
	private String masterItemid;
	private String timeout;
	private String url;
	private List<String> queryFields;
	private String posts;
	private String statusCodes;
	private String followRedirects;
	private String postType;
	private String httpProxy;
	private List<String> headers;
	private String retrieveMode;
	private String requestMethod;
	private String outputFormat;
	private String sslCertFile;
	private String sslKeyFile;
	private String sslKeyPassword;
	private String verifyPeer;
	private String verifyHost;
	private String allowTraps;
	private String discover;
	private String state;
	private String error;
	private String lastclock;
	private String lastns;
	private String lastvalue;
	private String prevvalue;

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSnmpOid() {
		return snmpOid;
	}

	public void setSnmpOid(String snmpOid) {
		this.snmpOid = snmpOid;
	}

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey_() {
		return key_;
	}

	public void setKey_(String key_) {
		this.key_ = key_;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getTrends() {
		return trends;
	}

	public void setTrends(String trends) {
		this.trends = trends;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public String getTrapperHosts() {
		return trapperHosts;
	}

	public void setTrapperHosts(String trapperHosts) {
		this.trapperHosts = trapperHosts;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getLogtimefmt() {
		return logtimefmt;
	}

	public void setLogtimefmt(String logtimefmt) {
		this.logtimefmt = logtimefmt;
	}

	public String getTemplateid() {
		return templateid;
	}

	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}

	public String getValuemapid() {
		return valuemapid;
	}

	public void setValuemapid(String valuemapid) {
		this.valuemapid = valuemapid;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getIpmiSensor() {
		return ipmiSensor;
	}

	public void setIpmiSensor(String ipmiSensor) {
		this.ipmiSensor = ipmiSensor;
	}

	public String getAuthtype() {
		return authtype;
	}

	public void setAuthtype(String authtype) {
		this.authtype = authtype;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPublickey() {
		return publickey;
	}

	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}

	public String getPrivatekey() {
		return privatekey;
	}

	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	public String getInterfaceid() {
		return interfaceid;
	}

	public void setInterfaceid(String interfaceid) {
		this.interfaceid = interfaceid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInventoryLink() {
		return inventoryLink;
	}

	public void setInventoryLink(String inventoryLink) {
		this.inventoryLink = inventoryLink;
	}

	public String getLifetime() {
		return lifetime;
	}

	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}

	public String getEvaltype() {
		return evaltype;
	}

	public void setEvaltype(String evaltype) {
		this.evaltype = evaltype;
	}

	public String getJmxEndpoint() {
		return jmxEndpoint;
	}

	public void setJmxEndpoint(String jmxEndpoint) {
		this.jmxEndpoint = jmxEndpoint;
	}

	public String getMasterItemid() {
		return masterItemid;
	}

	public void setMasterItemid(String masterItemid) {
		this.masterItemid = masterItemid;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<String> getQueryFields() {
		return queryFields;
	}

	public void setQueryFields(List<String> queryFields) {
		this.queryFields = queryFields;
	}

	public String getPosts() {
		return posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	public String getStatusCodes() {
		return statusCodes;
	}

	public void setStatusCodes(String statusCodes) {
		this.statusCodes = statusCodes;
	}

	public String getFollowRedirects() {
		return followRedirects;
	}

	public void setFollowRedirects(String followRedirects) {
		this.followRedirects = followRedirects;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getHttpProxy() {
		return httpProxy;
	}

	public void setHttpProxy(String httpProxy) {
		this.httpProxy = httpProxy;
	}

	public List<String> getHeaders() {
		return headers;
	}

	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}

	public String getRetrieveMode() {
		return retrieveMode;
	}

	public void setRetrieveMode(String retrieveMode) {
		this.retrieveMode = retrieveMode;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}

	public String getSslCertFile() {
		return sslCertFile;
	}

	public void setSslCertFile(String sslCertFile) {
		this.sslCertFile = sslCertFile;
	}

	public String getSslKeyFile() {
		return sslKeyFile;
	}

	public void setSslKeyFile(String sslKeyFile) {
		this.sslKeyFile = sslKeyFile;
	}

	public String getSslKeyPassword() {
		return sslKeyPassword;
	}

	public void setSslKeyPassword(String sslKeyPassword) {
		this.sslKeyPassword = sslKeyPassword;
	}

	public String getVerifyPeer() {
		return verifyPeer;
	}

	public void setVerifyPeer(String verifyPeer) {
		this.verifyPeer = verifyPeer;
	}

	public String getVerifyHost() {
		return verifyHost;
	}

	public void setVerifyHost(String verifyHost) {
		this.verifyHost = verifyHost;
	}

	public String getAllowTraps() {
		return allowTraps;
	}

	public void setAllowTraps(String allowTraps) {
		this.allowTraps = allowTraps;
	}

	public String getDiscover() {
		return discover;
	}

	public void setDiscover(String discover) {
		this.discover = discover;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getLastclock() {
		return lastclock;
	}

	public void setLastclock(String lastclock) {
		this.lastclock = lastclock;
	}

	public String getLastns() {
		return lastns;
	}

	public void setLastns(String lastns) {
		this.lastns = lastns;
	}

	public String getLastvalue() {
		return lastvalue;
	}

	public void setLastvalue(String lastvalue) {
		this.lastvalue = lastvalue;
	}

	public String getPrevvalue() {
		return prevvalue;
	}

	public void setPrevvalue(String prevvalue) {
		this.prevvalue = prevvalue;
	}

}
