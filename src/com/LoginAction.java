package com;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	 private String username;
	 private String pwd;
	 private String abc;
	 
	 public String execute() throws UnsupportedEncodingException{
		// System.out.println("username.getBytes(Charset.forName(\"GBK\") :"+new String(username.getBytes(Charset.forName("GBK"))));
		// System.out.println("username.getBytes(\"ISO-8859-1\"),\"utf-8\")"+ new String(username.getBytes("ISO-8859-1"),"utf-8"));
		 System.out.println("username:"+username);
		 System.out.println("pwd"+pwd);
		 System.out.println("abc"+abc);
		 
	  if("test".equals(username)&&"1".equals(pwd))//{\"name\":1,\"password\":2}
		  return "success";  
      else  
          return "fail";  
	 }
	 
	 public String getUsername() {
	  return username;
	 }
	 public void setUsername(String username) {
	  this.username = username;
	 }
	 public String getUserpass() {
	  return pwd;
	 }
	 public void setUserpass(String pwd) {
	  this.pwd = pwd;
	 }
	 public String getAbc() {
	 return abc;
	 }
	 public void setAbc(String abc) {
	 this.abc = abc;
	 }
	}