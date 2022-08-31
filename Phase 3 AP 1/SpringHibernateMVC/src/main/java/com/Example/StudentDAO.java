package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDAO {
	
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	//update,delete
	public int insert(Student s) {
		System.out.println("in dao"+s.getSname());
		System.out.println(temp);
		return (Integer) temp.save(s);
	}
	
	//retrieve
	public List<Student> getall(){
		String sql="from Student";
		return (List<Student>) temp.find(sql);
	}
	
	

}
