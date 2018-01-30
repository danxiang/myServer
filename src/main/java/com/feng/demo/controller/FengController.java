/**
 * 
 */
package com.feng.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.feng.demo.controller.base.BaseController;

/**
 * @author danxiang.feng 2018年1月3日
 */
@Controller
@RequestMapping(value = "/feng")
public class FengController extends BaseController {

	@RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST }, produces = {
	"application/json; charset=utf-8" })
	public @ResponseBody Object test(@RequestBody Object request) {
		log.info("request=======>" + JSONObject.toJSONString(request));

		return request;

	}

}
