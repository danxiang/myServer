package com.feng.demo.bean;

import java.io.Serializable;

public class MessageRequest implements Serializable{
	
	private static final long serialVersionUID = 5120156392811241717L;
	
	private int pageSize;
	private int pageNum;
	private String messageId;
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	

}
