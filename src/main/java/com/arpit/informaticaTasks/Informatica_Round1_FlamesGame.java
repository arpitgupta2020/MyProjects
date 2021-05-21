package com.arpit.informaticaTasks;


//Arpit 
//Ankita
//Flames

public class Informatica_Round1_FlamesGame {

	public static void main(String[] args) {
		String s1= "Arpit";
		String s2= "Ankita";
		String result="Flames";
		
		flamesGame(s1, s2, result);
	}

	private static void flamesGame(String s1, String s2, String result) {
		int counter=0;
		String temp= s2;
		for(int i=0; i< s1.length(); i++) {
			if(temp.contains(String.valueOf(s1.charAt(i)))) {
				temp= temp.replaceFirst(String.valueOf(s1.charAt(i)), "");
				counter++;
			}
		}
		
		System.out.println(counter);
		
		int matchCount= (s1.length()- counter) + (s2.length()-counter);
		System.out.println(matchCount);
		
		//Find flames left char
        StringBuilder flames = new StringBuilder(result);
        
        char flameResult = 0;
        
        while(flames.length()!=1)
        {
            int y = matchCount%flames.length(); 
            String temp2;
            
            if(y!=0)
            {
                temp2 = flames.substring(y)+flames.substring(0, y-1); // taking substring (counting purpose)
                
            }
            else
            {
                temp2 = flames.substring(0, flames.length()-1); // taking substring (counting purpose)
                
            }
            flames = new StringBuilder(temp2);            
        }
        
        flameResult = flames.charAt(0);
        System.out.println(flameResult);
		
        printResult(flameResult);
	}

	private static void printResult(char flameResult) {
		switch(flameResult)
        {
            case 'F':
                System.out.println("Friends");
                break;
            case 'l':
                System.out.println("Love");
                break;
            case 'a':
                System.out.println("Affection");
                break;
            case 'm':
                System.out.println("Marriage");
                break;
            case 'e':
                System.out.println("Enemies");
                break;
            case 's':
                System.out.println("Sibling");
                break;
                
        }
	}

}
