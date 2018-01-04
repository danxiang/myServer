package com.feng.demo.bean;

import java.io.Serializable;

public class BaseReponse implements Serializable {
	
	private String returnCode;
	private String returnMsg;
	private Object responseVo;
	private String monitorTrackId;
	
	public BaseReponse() {}
	
	public BaseReponse(String returnCode, String returnMsg) {
		this.returnCode = returnCode;
		this.returnMsg = returnMsg;
	}
	
	public BaseReponse(String returnCode, Object responseVo) {
		this.returnCode = returnCode;
		this.responseVo = responseVo;
	}
	
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}
	public Object getResponseVo() {
		return responseVo;
	}
	public void setResponseVo(Object responseVo) {
		this.responseVo = responseVo;
	}
	public String getMonitorTrackId() {
		return monitorTrackId;
	}
	public void setMonitorTrackId(String monitorTrackId) {
		this.monitorTrackId = monitorTrackId;
	}

}
