package com.arpit.strings;

//https://www.youtube.com/watch?v=nxo_4FzXLxU

class StringEqualsOnBackSpace {

	public static String testStringEqualsOnBackSpace(String str1) {

		StringBuffer sbf = new StringBuffer();

		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) != '#') {
				sbf.append(str1.charAt(i));
			} else if (sbf.length() != 0 && str1.charAt(i) == '#') {
				sbf.deleteCharAt(sbf.length() - 1);
			}
		}
		return sbf.toString();
	}

}

public class StringEqualsBasedOnBackSpace {

	public static void main(String[] args) {
		String str1 = "ab#cd#";
		String output1 = StringEqualsOnBackSpace.testStringEqualsOnBackSpace(str1);
		System.out.println(output1);
		String str2 = "ab#d#c";
		String output2 = StringEqualsOnBackSpace.testStringEqualsOnBackSpace(str2);
		System.out.println(output2);
		if (output1 == null || output1.length() == 0 || output2 == null || output2.length() == 0) {
			System.out.println("Please enter a valid output1 or output2");
		} else if (output1.equals(output2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}

/*
 * class TestDummy {
  
  public static String testDummy(String str1){
    
    Stack<Character> stack = new Stack<Character>();
    
    String newStringAfterRemovingBackSpaces = "";
    
    char[] c = str1.toCharArray();
    
    for(int i=0; i<c.length; i++){
      
      if(c[i]!='#'){
        
        stack.push(c[i]);
      }else if(!stack.isEmpty() && c[i]=='#') {
        
        stack.pop();
        
      }
      
    }
    
    while(!stack.isEmpty()){
      
      newStringAfterRemovingBackSpaces = newStringAfterRemovingBackSpaces+stack.pop();
      
    }
  
    return newStringAfterRemovingBackSpaces;
  }
  
  
}
class Solution {
  public static void main(String[] args) {
    String str1 = "ab##cd#";
    String output1 = TestDummy.testDummy(str1);
    System.out.println(output1);
    String str2= "ab##d#c";
    String output2 = TestDummy.testDummy(str2);
    System.out.println(output2);
    
    if(output1==null || output1.length()==0 || output2==null || output2.length()==0){
      System.out.println("Please enter a valid output1 or output2");
    }else if(output1.equals(output2)){
      System.out.println("True");
    }else {
      System.out.println("False");
    }
  }
}
*/
