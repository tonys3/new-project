package com.hb.action;

import java.util.List;
import java.util.Map;

import com.hb.model.SimpleDao;
import com.opensymphony.xwork2.ActionSupport;

public class SelectAll extends ActionSupport {
	private List<Map<String, Object>> list;
	
	public List<Map<String, Object>> getList() {
		return list;
	}
	
	@Override
	public String execute() throws Exception {
		SimpleDao dao = new SimpleDao();
		list=dao.selectAll();
		
		return this.SUCCESS;
	}
}
