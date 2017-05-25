package com.hb.controller;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hb.engine.FrontImp;
import com.hb.model.SimpleDao;

public class DetailController implements FrontImp {

	public String execute(HttpServletRequest req){
		SimpleDao dao;
		try {
			dao = new SimpleDao();
			Map<String,Object> map=dao.selectOne(Integer.parseInt(req.getParameter("idx")));
			req.setAttribute("bean", map);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "bean";
	}
}
