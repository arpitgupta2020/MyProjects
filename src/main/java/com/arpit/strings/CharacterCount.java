package com.arpit.strings;

public class CharacterCount {
	
  public static void main(String[] args) {
	CharacterCount charactercount = new CharacterCount();
	charactercount.countRepeatedChars("Folloowwwuupp");
  }
  
  public void countRepeatedChars(String s) {
	  int count[] = new int[256];// initialised to zero
	  
	  char c[] = s.toCharArray();
	  for(char x:c) {
		count[x]++;
	  }
	  for(int i=0;i<count.length;i++) {
		  if(count[i] > 0)
			System.out.println((char)i +" = "+count[i]);
	  }
	  
  }
}
