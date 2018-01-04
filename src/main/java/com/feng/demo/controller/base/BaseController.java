package com.feng.demo.controller.base;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import com.feng.demo.bean.BaseRequest;

@Controller
public class BaseController {
	
	protected Logger log = Logger.getLogger(BaseController.class);

	/**
	 * 获取请求ip信息
	 * 
	 * @param form
	 * @param request
	 */
	protected void getRemoteIp(BaseRequest form, HttpServletRequest request) {
		String ipString = request.getHeader("x-forwarded-for");
		if (StringUtils.isEmpty(ipString) || "unknown".equalsIgnoreCase(ipString)) {
			ipString = request.getHeader("Proxy-Client-IP");
		}
		if (StringUtils.isEmpty(ipString) || "unknown".equalsIgnoreCase(ipString)) {
			ipString = request.getHeader("WL-Proxy-Client-IP");
		}
		if (StringUtils.isEmpty(ipString) || "unknown".equalsIgnoreCase(ipString)) {
			ipString = request.getRemoteAddr();
		}

		// 多个路由时，取第一个非unknown的ip
		final String[] arr = ipString.split(",");
		for (final String str : arr) {
			if (!"unknown".equalsIgnoreCase(str)) {
				ipString = str;
				break;
			}
		}
		form.setRemoteIp(ipString);
	}

}
