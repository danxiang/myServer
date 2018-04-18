package com.feng.demo.bean;

import java.io.Serializable;

public class MessageInfo implements Serializable{

	private static final long serialVersionUID = 7495568032885353535L;
	
	private String messageId;    //消息ID
    private String messageType;  //消息类型
    private int readStatus;      //是否已读 0：未读 1：已读
    private String title;            // 主标题名
    private String subtitle;         // 副标题名
    private String descript;         // 描述信息
    private String pictureUrl;       // 图片URL
    private String routerUrl;        // 跳转路由
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public int getReadStatus() {
		return readStatus;
	}
	public void setReadStatus(int readStatus) {
		this.readStatus = readStatus;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getRouterUrl() {
		return routerUrl;
	}
	public void setRouterUrl(String routerUrl) {
		this.routerUrl = routerUrl;
	}
    
    
}
