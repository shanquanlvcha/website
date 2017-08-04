package com.qsf.websit.bkmgr.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qsf.websit.bkmgr.service.CaseService;

import io.netty.handler.codec.http.HttpRequest;

@Controller
@RequestMapping(value = "/case")
public class CaseController {
	
	@Resource
    private CaseService caseService;
	
	@RequestMapping(value = "/list")
	public ModelAndView listCases(HttpServletRequest httpRequest)
	{
		
		ModelAndView mv = new ModelAndView();
		String a = httpRequest.getParameter("") ;
		HashMap hashMap = new HashMap();
		hashMap.put("a", a);
		
		//List list = caseService.listCase(hashMap);
		//mv.addObject("list", list);
		return mv ;
	}

}
