package com.hb.spring3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.spring3.model.SimpleDao;

public class SelectAllController implements Controller {
	private SimpleDao dao;
	
	public void setDao(SimpleDao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("alist", dao.SelectAll());
		return mav;
	}

}
