package com.arpit.myPrep;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateOTP_Formatted_Luxsoft {

	public static void main(String[] args) {
		String randString1= RandomStringUtils.randomAlphabetic(1);
		String randString2= RandomStringUtils.randomAlphabetic(2);
		
		randString1= randString1.toUpperCase();
		randString2= randString2.toUpperCase();
		
		Random rand= new Random();
		int randInt= rand.nextInt(100);
		
		System.out.println(randString1+randInt+randString2);
		
	}

}
