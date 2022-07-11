package com.theplayer.dragon.webpage.footballs;

import java.util.HashMap;

public class ServletContextParam {
	private static HashMap<String, String> params;
	private static String uploadPath;
	public ServletContextParam() {
	}
	public ServletContextParam(HashMap<String, String> map){
		this.params = map;
	}
	
	public ServletContextParam(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getParamter(String key) {
		return params.get(key);
	}
	public String getUploadPath() {
		return uploadPath;
	}
}
