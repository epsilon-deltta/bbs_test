package com.test.yp.bbs;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class bbs_homeController {
	@Autowired
	bbs_Service service;
	private static final Logger logger = LoggerFactory.getLogger(bbs_homeController.class);
	
	@RequestMapping(value = "/bbs", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpServletRequest request) {
		logger.info("come in bbs {}.", locale);
		
//		String page = request.getParameter("page");
		
		model.addAttribute("list",service.getList());
		
		
		return "bbs_Home";
	}


}
