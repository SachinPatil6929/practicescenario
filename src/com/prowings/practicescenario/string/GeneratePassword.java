package com.prowings.practicescenario.string;

import java.util.Random;

public class GeneratePassword {
	private static char[]createpassword(int strength,int length){
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String specialchar = "!@#$%&";
		String number = "1234567890";
		String combo1 = uppercase+lowercase;
		String combo2 = uppercase+lowercase+number;
		String combo3 = uppercase+lowercase+specialchar+number;
		
		Random random = new Random();
		char[] password = new char[length];
		
		
	
		for(int i=0; i<length; i++) {
			if (strength == 1);
			password[i]=combo1.charAt(random.nextInt(combo1.length()));
			if (strength == 2);
			password[i]=combo2.charAt(random.nextInt(combo2.length()));
			if (strength == 3);
			password[i]=combo3.charAt(random.nextInt(combo3.length()));
			
			
		}
		return password;
	}
	public static void main(String[] args) {
		System.out.println(createpassword(1,8));
		System.out.println(createpassword(2,8));
		System.out.println(createpassword(3,8));
	}

}
