package com.sise.struts2.lab3.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String tip;
	public String getUsername() {return username;}
	public String getPassword() {	return password;}
	public String getTip() {	return tip;}
	public void setUsername(String username) {	this.username = username;}
	public void setPassword(String password) {	this.password = password;}
	public void setTip(String tip) {this.tip = tip;}
	
	@Override
	public String execute() throws Exception {
		ActionContext ctx=ActionContext.getContext();
		Map session =ctx.getSession();
		if (username!=null&&username.equals("admin")&&
				password!=null&&password.equals("sise")) {
			session.put("username", username);
			return SUCCESS;
		}else{
			addFieldError("username", "用户名或者密码错误");
			return LOGIN;
		}		
	}
	public String addUser()throws Exception{
		return "add";	}
}


