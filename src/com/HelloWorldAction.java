package com;

import java.util.Iterator;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	private Map<String, String[]> parameters; //接收参数

	 public String execute(){
		 String[] params1 = (String[]) parameters.get("myJson");//接收myJson参数
		 String json = new String(params1[0]);
		 System.out.println(json);
		 Gson gson = new Gson();
		 String jso1n = gson.toJson(json);
		 System.out.println(jso1n);
		 JsonParser pa = new JsonParser();
		 JsonArray arr = pa.parse(json).getAsJsonArray();
		 Iterator it = arr.iterator();
		 while(it.hasNext()){
		 System.out.println(it.next());
		 }
		 return "success";
	 }
	 
	 public void setParameters(Map<String, String[]> parameters) {
		 this.parameters = parameters;
		 }
	}