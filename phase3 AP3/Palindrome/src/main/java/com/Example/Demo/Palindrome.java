package com.example;

public class Palindrome {
public String checkPalindrome(int n) {
	int sum=0,rem,temp;
	temp=n;
	while(n>0){    
		   rem=n%10;  
		   sum=(sum*10)+rem;    
		   n=n/10;    
		  }    
	if(temp==sum) {
		return "It is a palindrome number"; 
	}
	else {
		return "Not a palindrome number";
	}
}
}
