package com.prowings.practicescenario.string;
import java.util.Random;

public class Password {
	private static char[]createpassword(int length){
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String specialchar = "!@#$%&";
		String number = "1234567890";
		String combo = uppercase+lowercase+specialchar+number;
		Random random = new Random();
		char[] password = new char[length];
		
		password[0]= uppercase.charAt(random.nextInt(uppercase.length()));
		password[1]= lowercase.charAt(random.nextInt(lowercase.length()));
		password[2]= specialchar.charAt(random.nextInt(specialchar.length()));
		password[3]= number.charAt(random.nextInt(number.length()));
		
		for(int i=0; i<length; i++) {
			password[i]=combo.charAt(random.nextInt(combo.length()));
			
			
		}
		return password;
	}
	public static void main(String[] args) {
		System.out.println(createpassword(8));
	}
}
