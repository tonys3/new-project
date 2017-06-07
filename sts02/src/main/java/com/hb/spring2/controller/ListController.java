package com.hb.spring2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.spring2.model.SimpleDao;
import com.hb.spring2.model.daoImpl;

public class ListController implements Controller {
	private daoImpl dao;
 	
 	public void setDao(daoImpl dao) {
 		this.dao = dao;
 	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		System.out.println("list dao:"+dao);
//		SimpleDao dao = new SimpleDao();
		mav.addObject("alist", dao.selectAll());
		mav.setViewName("list");
		return mav;
	}

}
