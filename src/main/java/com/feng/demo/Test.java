package com.feng.demo;

import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.feng.demo.bean.GoodsInfo;

public class Test {

	public static void main(String[] args) {
		// System.out.println("qweqwe".indexOf(null) != -1);
		//
		// Integer aInteger = new Integer(23);
		//
		// String aString = aInteger.toString();
		// System.out.println(aString);

//		Integer a = 127;
//		Integer b = 127;
//		Integer c = 128;
//		Integer d = 128;
//		
//		System.out.println(a==b);
//		System.out.println(c==d);
		
//		int score = 41;
//		score = score /100 * 10 + 10;
//		System.out.println(score);
		
		GoodsInfo[] goodsInfos = new GoodsInfo[3];
		
		goodsInfos[0] = new GoodsInfo();
		goodsInfos[2] = new GoodsInfo();
		
		System.out.println(JSONObject.toJSON(goodsInfos));
	}

}
