package com.arpit.arrays;

import java.util.*;


public class StringReverse {
   
Stack st;
StringTokenizer strToken;

StringReverse(){
    
    st = new Stack();
    
}

public void reverseSentence(String str){
    
    strToken = new StringTokenizer(str);
    int count = strToken.countTokens();
    while (strToken.hasMoreTokens()){
        st.push(strToken.nextToken());
    }
    
    for ( int i =0; i < count; i++){
        System.out.println(st.pop());
    }
    
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	StringReverse o = new StringReverse();
        o.reverseSentence("Hello my name is");
    }

}