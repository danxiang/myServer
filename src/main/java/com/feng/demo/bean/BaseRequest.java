package com.feng.demo.bean;

import java.io.Serializable;
import java.util.HashMap;

public class BaseRequest implements Serializable {
	
	private static final long serialVersionUID = -517055114692479527L;
	
	private String appIdentifier; // 应用包名
	private String requestSource; // 请求源 Android & iOS
	private String appVersion; // app版本号
	private String systemVersion; // 手机系统版本
	private String mobileModel; // 手机型号
	private String channel; // 渠道
	private String remoteIp;  //IP
	
	private String serviceName;
	private String methodName;
	private String reqParams; // 具体请求参数JSON
	private HashMap<String, Object> reqParamMap; // 具体请求参数Map
	
	public String getAppIdentifier() {
		return appIdentifier;
	}
	public void setAppIdentifier(String appIdentifier) {
		this.appIdentifier = appIdentifier;
	}
	public String getRequestSource() {
		return requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getSystemVersion() {
		return systemVersion;
	}
	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getRemoteIp() {
		return remoteIp;
	}
	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getReqParams() {
		return reqParams;
	}
	public void setReqParams(String reqParams) {
		this.reqParams = reqParams;
	}
	public HashMap<String, Object> getReqParamMap() {
		return reqParamMap;
	}
	public void setReqParamMap(HashMap<String, Object> reqParamMap) {
		this.reqParamMap = reqParamMap;
	}
}
