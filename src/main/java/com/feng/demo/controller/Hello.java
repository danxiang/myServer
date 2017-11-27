package com.feng.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.feng.demo.bean.BaseRequest;
import com.feng.demo.bean.GoodsInfo;

@Controller
@RequestMapping(value = "/hello")
public class Hello {

	private Logger log = Logger.getLogger(Hello.class);

	@RequestMapping(value = "/helloWorld", method = { RequestMethod.GET, RequestMethod.POST })
	public String helloWorld(Model model) {
		System.out.println("111111111111");
		model.addAttribute("message", "Hello Feng!");

		return "HelloWorld";
	}

	@RequestMapping(value = "testServer", method = { RequestMethod.POST })
	public void testServer(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			Object requestObj = request.getParameterMap();
			System.out.println("requestObj====>" + JSON.toJSONString(requestObj));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String requestJson = request.getParameter("request");
		System.out.println(requestJson);
		GoodsInfo info = new GoodsInfo();
		info.setId(111);
		response.setHeader("content-type", "text/html;charset=UTF-8");
		try {
			PrintWriter out = response.getWriter();
			out.print(JSON.toJSONString(info));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "testServer2", method = RequestMethod.POST)
	public @ResponseBody Object testServer2(@RequestBody BaseRequest request) {
		try {
			@SuppressWarnings("unchecked")
			HashMap<String, Object> reqParams = request.getReqParams();
			if (reqParams != null) {
				int page = Integer.parseInt(String.valueOf(reqParams.get("pageNum")));
				Object response = testGoodsInfo(page);
				log.debug("\n request: "+JSON.toJSONString(request)+"\n response: "+JSONObject.toJSONString(response));
				return response;
			}
		} catch (Exception e) {
		}
		log.error("参数异常   request: "+JSON.toJSONString(request));
		return "参数异常";
	}

	private List<GoodsInfo> testGoodsInfo(int page) {
		List<GoodsInfo> goodsInfos = new ArrayList<GoodsInfo>();
		GoodsInfo info = null;
		for (int i = page; i - page < 10; i++) {
			info = new GoodsInfo();
			info.setId(i);
			info.setTitle("标题" + i);
			info.setSale_price(i * 5);
			info.setOriginal_price(i * 10);
			info.setSales(i * 100);
			info.setCollect(i * 50);
			info.setCredit("信用度");
			if (i % 2 == 0) {
				info.setPic_url("http://img2.imgtn.bdimg.com/it/u=993422464,1194408700&fm=27&gp=0.jpg");
			} else {
				info.setPic_url("http://img2.imgtn.bdimg.com/it/u=1605823205,2909663797&fm=27&gp=0.jpg");
			}
			info.setShop_id("店铺_" + i);
			info.setShop_name("店铺名称_" + i);
			info.setAddress("地址");
			info.setComments("评价");
			info.setCreatTime(new Date());

			goodsInfos.add(info);
		}
		return goodsInfos;
	}
}
