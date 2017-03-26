package com.sise.lab3.interceptor;

import java.util.Map;



import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		ActionContext ctx=ai.getInvocationContext();
		Map session=ctx.getSession();
		String username=(String)session.get("username");
		if (username!=null) {
			System.out.println("用户已经登录");
			return ai.invoke();
		}else{
			ctx.put("tip", "您还没有登录，请登录");
			return Action.LOGIN;
		}
			
	}
	

}



