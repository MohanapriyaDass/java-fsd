package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

Logger log=Logger.getAnonymousLogger();

	@RequestMapping("/add")
public ModelAndView displayadd(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv=new ModelAndView();
		log.info("inside the add request");
		int result=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		log.info("result cal done"+ result);
		mv.setViewName("display.jsp");
		log.info("control going to display.jsp");
		mv.addObject("sum",result);
		log.info("the sum value is set to display.jsp");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/sub")
public String displaysub(HttpServletRequest request,HttpServletResponse response) {
int result=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
return "sub of the numbers are "+ result;		
	}
}
