package com.feng.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;
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
		
//		GoodsInfo[] goodsInfos = new GoodsInfo[3];
//		
//		goodsInfos[0] = new GoodsInfo();
//		goodsInfos[2] = new GoodsInfo();
//		
//		System.out.println(JSONObject.toJSON(goodsInfos));
		
		testList();
	}
	
	private static void testList() {
		String str1[] = {"11","22","66","33","99","00"};
		String str2[] = {"44","11","55","99","22"};
		
		//list1 removeAll list2: ["66","33","00"]
		//list1 removeAll list2: ["11","22","99"]
		
		List<String> list1 = new ArrayList<>(Arrays.asList(str1));
		List<String> list2 = new ArrayList<>(Arrays.asList(str2));
		
		System.out.println("list1: " + list1.toString());
		System.out.println("list2: " + list2.toString());
		list1.retainAll(list2);    
		System.out.println("list1 removeAll list2: " + list1.toString());
	}

}
