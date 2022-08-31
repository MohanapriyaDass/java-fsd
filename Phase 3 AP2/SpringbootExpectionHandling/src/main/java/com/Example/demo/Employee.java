package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
//lombok -it will be taking the auto setters and getters ,auto constructor and tostring()

@Data
@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int empno;
private String empname;
private String phono;
private int age;

}
