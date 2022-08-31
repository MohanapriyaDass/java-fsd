package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Student s=ac.getBean(Student.class);
		System.out.println(s);
		s.setSname(req.getParameter("name"));
		s.setSemail(req.getParameter("email"));
		StudentDAO dao=ac.getBean(StudentDAO.class);
		System.out.println(dao);
		System.out.println(s.getSname());
		int row=dao.insert(s);
		
		if(row>0) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Student s=ac.getBean(Student.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
		List<Student> stu=dao.getall();
		mv.setViewName("displayall.jsp");
		mv.addObject("student", stu);
		return mv;
	}
	
	
}
