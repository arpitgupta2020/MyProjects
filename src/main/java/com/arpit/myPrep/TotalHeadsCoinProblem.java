package com.arpit.myPrep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TotalHeadsCoinProblem {

	public static void main(String[] args) {
		SimpleDateFormat sf= new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		Date date= new Date();
		System.out.println(sf.format(date));
	}

}
