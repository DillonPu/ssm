package com.ssm.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ssm.utils.baidu.transAPI.TransApi;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

@Controller
public class BaiduTrans {

	// 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "替换成你的app_id";
    private static final String SECURITY_KEY = "替换成你的SECURITY_KEY";
	/**
	 * @param from 翻译源语言 
	 * @param to 译文语言  
	 * @param trans_from 需要翻译的文本
	 */
	@RequestMapping("trans")
	public String baidu_trans(String from,String to,String trans_form,HttpServletResponse response,Model model) {
		TransApi api = new TransApi(APP_ID, SECURITY_KEY);
		String trans_value = api.getTransResult(trans_form, from, to);
		JSONObject baiduJsonObj = (JSONObject) JSON.parse(trans_value);
		JSONArray array = JSONArray.parseArray(baiduJsonObj.getString("trans_result"));
		JSONObject dist = (JSONObject) array.get(0);
		String trans_result = dist.getString("dst"); //翻译后的文字
		String trans_origin = dist.getString("src");//原文
		
		model.addAttribute("trans_result", trans_result);
		model.addAttribute("trans_origin", trans_origin);
        return "index";
        		
	}
}
