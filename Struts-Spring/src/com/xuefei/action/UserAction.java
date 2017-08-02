package com.xuefei.action;

import com.xuefei.utils.BaseAction;

public class UserAction extends BaseAction{
	
	private static final long serialVersionUID = 1L;
	
	public UserAction() {
		System.out.println("创建UserAction");
	}

	public String execute() throws Exception {
		System.out.println("=========OK==========");
		return SUCCESS;
	}
}
