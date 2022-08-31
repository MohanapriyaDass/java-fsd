package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/add")
public String displayadd(HttpServletRequest request,HttpServletResponse response) {
int result=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
return "sum of the numbers are "+ result;		
	}
	
	@ResponseBody
	@RequestMapping("/sub")
public String displaysub(HttpServletRequest request,HttpServletResponse response) {
int result=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
return "sub of the numbers are "+ result;		
	}
}
