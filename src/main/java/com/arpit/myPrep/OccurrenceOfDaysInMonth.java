package com.arpit.myPrep;
import java.util.Scanner;

//Input will be NoOfDaysInMonth and FirstDayOfMonth

public class OccurrenceOfDaysInMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String firstDay= sc.nextLine();
		
		int noOfDays= sc.nextInt();
		
		occurrenceOfEachDayInMonth(noOfDays, firstDay);
		sc.close();
	}

	private static void occurrenceOfEachDayInMonth(int noOfDays, String firstDay) {
		
		String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int[] noOfOccurrenceForEachDay= new int[7];
		
		int indexOfFirstDayOfMonth=0;
		//Initialize Minimum occurrence for each day to 4 & get the position of First occurred day from an array
		for(int i=0; i<noOfOccurrenceForEachDay.length;i++) {
			noOfOccurrenceForEachDay[i]=4;
			if(firstDay.equalsIgnoreCase(days[i])) {
				indexOfFirstDayOfMonth= i+1;
			}
		}
		//Get count of extra days after 28 days
		int extraDays= noOfDays%7;
		
		//Increment the count of days which occurred 5 times
		for(int k=0; k< extraDays; k++) {
			if(indexOfFirstDayOfMonth==7) {
				indexOfFirstDayOfMonth=0;
			}
			noOfOccurrenceForEachDay[indexOfFirstDayOfMonth]= noOfOccurrenceForEachDay[indexOfFirstDayOfMonth]+1;
			indexOfFirstDayOfMonth++;
		}
		//Print Each day with occurrence
		for(int j=0; j< days.length;j++) {
			System.out.println("Occurence of : "+days[j]+" is - "+noOfOccurrenceForEachDay[j]);
		}
		
	}

}
