package com.example;

public class AgeValidator {
public String ageValid(int age) {
	if(age>=18) {
		return "right to vote";
	}
	else {
		return "not eligible";
	}
}
}


