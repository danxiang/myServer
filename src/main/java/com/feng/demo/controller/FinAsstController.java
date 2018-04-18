package com.feng.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.feng.demo.bean.BaseReponse;
import com.feng.demo.bean.BaseRequest;
import com.feng.demo.bean.MessageInfo;
import com.feng.demo.bean.MessageRequest;
import com.feng.demo.controller.base.BaseController;

@Controller
public class FinAsstController extends BaseController {

	private Logger log = Logger.getLogger(FinAsstController.class);

	@RequestMapping(value = "/asst/proxy", method = { RequestMethod.POST, RequestMethod.GET }, produces = {
			"application/json; charset=utf-8" })
	public @ResponseBody Object controller(@RequestBody BaseRequest baseRequest, HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) {
		getRemoteIp(baseRequest, servletRequest);
		log.debug("request: " + JSON.toJSONString(baseRequest));

		if ("messageService".equals(baseRequest.getServiceName())) {
			if ("queryMessage".equals(baseRequest.getMethodName())) {
				return new BaseReponse("000000", getMessageList(baseRequest));
			} else if ("getMessageDetialById".equals(baseRequest.getMethodName())) {
				return new BaseReponse("000000", getMessageDetialById(baseRequest));
			} else if ("update".equals(baseRequest.getMethodName())) {
				return new BaseReponse("000000", null);
			}
		}
		return new BaseReponse("100000", "参数异常1");
	}

	private Object getMessageList(BaseRequest baseRequest) {
		String reqParams = baseRequest.getReqParams();
		if (reqParams != null) {
			MessageRequest messageRequest = JSONObject.parseObject(reqParams, MessageRequest.class);
			int pageNum = messageRequest.getPageNum();
			int pageSize = messageRequest.getPageSize();
			Object response = getMessageList(pageNum, pageSize);
			log.debug("response: " + JSONObject.toJSONString(response));
			return response;
		}
		return "参数异常2";
	}

	private Object getMessageDetialById(BaseRequest baseRequest) {

		String reqParams = baseRequest.getReqParams();
		if (reqParams != null) {
			MessageRequest messageRequest = JSONObject.parseObject(reqParams, MessageRequest.class);
			String messageId = messageRequest.getMessageId();
			Object response = getMessageInfoById(messageId);
			log.debug("response:" + JSONObject.toJSONString(response));
			return response;
		}
		return "参数异常";
	}

	private List<MessageInfo> getMessageList(int pageNum, int pageSize) {
		if (pageSize <= 0) {
			pageSize = 10;
		}
		int start = (pageNum - 1) * pageSize + 1;
		int end = pageNum * pageSize;
		List<MessageInfo> messageInfos = new ArrayList<MessageInfo>();
		for (int i = start; i <= end; i++) {
			messageInfos.add(getMessageInfoById(String.valueOf(i)));
		}
		return messageInfos;
	}

	private MessageInfo getMessageInfoById(String messageId) {
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setMessageId(messageId);
		messageInfo.setTitle("消息标题" + messageId);
		messageInfo.setSubtitle("2017-02-12 13:23:09");
		messageInfo.setDescript("消息描述" + messageId);
		messageInfo.setReadStatus(0);
		messageInfo.setRouterUrl(
				"<a href=\"mxdl://fin-loan.weimob.com/query/score\"><font color='#F9972B'>点击查看详情</font></a>");
		// messageInfo.setPictureUrl("http://caiwu-10054239.file.myqcloud.com/online/20170602/EC07288C61E9C43D5C7FD3B801DF7072.png");
		return messageInfo;
	}

}
