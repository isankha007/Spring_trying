package com.to;

public class SomeBO {
	public void Validate() {
		System.out.println("Validation stuff from BO");
	}
	public void Validate(int age) throws Exception{
		if(age<18) {
			throw new ArithmeticException("age not valid");
		}else {
			System.out.println("Vote Confiremd");
		}
		
	}
}
