package com.feng.demo.bean;

import java.io.Serializable;
import java.util.HashMap;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter 
public class BaseRequest implements Serializable {

	private String appIdentifier; // 应用包名
	private String requestSource; // 请求源 Android & iOS
	private String appVersion; // app版本号
	private String systemVersion; // 手机系统版本
	private String mobileModel; // 手机型号
	private String channel; // 渠道
	private HashMap<String, Object> reqParams; // 具体请求参数
	
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
	public HashMap<String, Object> getReqParams() {
		return reqParams;
	}
	public void setReqParams(HashMap<String, Object> reqParams) {
		this.reqParams = reqParams;
	}

	
	

}
