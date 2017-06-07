package com.hb.spring2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.hb.spring2.model.daoImpl;

public class DetailController extends AbstractController {
	private daoImpl dao;
	private String viewName;
	
	public void setDao(daoImpl dao) {
		this.dao = dao;
	}
	
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	
 	@Override
 	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
 			throws Exception {
 		ModelAndView mav = new ModelAndView();
 		mav.addObject("bean" 
 				, dao.selectOne(Integer.parseInt(request.getParameter("idx"))));
 		mav.setViewName(viewName);
 		return mav;
 	}
	 
}
