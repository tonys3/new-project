package com.hb.spring2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.hb.spring2.model.SimpleDao;
import com.hb.spring2.model.SimpleVo;
import com.hb.spring2.model.daoImpl;

public class InsertController extends AbstractController {
	private daoImpl dao;

	public void setDao(daoImpl dao) {
		this.dao = dao;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		System.out.println("insert dao:"+dao);
		dao.insertOne(new SimpleVo(
				 Integer.parseInt(request.getParameter("sabun"))
				,request.getParameter("name")
				, null
				,Integer.parseInt(request.getParameter("pay"))
				));
		mav.setViewName("redirect:list.do");
		return mav;
	} 

}
