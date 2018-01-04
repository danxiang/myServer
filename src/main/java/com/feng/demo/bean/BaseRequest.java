package com.feng.demo.bean;

import java.io.Serializable;
import java.util.HashMap;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BaseRequest implements Serializable {

	
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

}
