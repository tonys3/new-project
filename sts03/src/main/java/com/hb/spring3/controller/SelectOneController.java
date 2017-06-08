package com.hb.spring3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.pattern.IntegerPatternConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.spring3.model.SimpleDao;

public class SelectOneController implements Controller {
	private SimpleDao dao;
	
	public void setDao(SimpleDao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView("detail");
		mav.addObject("bean", dao.selectOne(Integer.parseInt(req.getParameter("idx"))));
		return mav;
	}

}
