package com.arpit.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*abc…  Letters
123…    Digits
\d      Any Digit
\D      Any Non-digit character
.       Any Character
\.      Period
[abc]   Only a, b, or c
[^abc]  Not a, b, nor c
[a-z]   Characters a to z
[0-9]   Numbers 0 to 9
\w      Any Alphanumeric character
\W      Any Non-alphanumeric character
{m}     m Repetitions
{m,n}   m to n Repetitions
*       Zero or more repetitions
+       One or more repetitions
?       Optional character
\s      Any Whitespace
\S      Any Non-whitespace character
^…$     Starts and ends
(…)     Capture Group
(a(bc)) Capture Sub-group
(.*)    Capture all
(ab|cd) Matches ab or cd*/

public class SplitBasedOnDelimeters {

	public static void main(String[] args) {
		String text = "geeks1for2geeks3";
		
		// Specifies the string pattern which is to be searched 
		String delimiter = "[0-9]";
		Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);

		// Used to perform case insensitive search of the string 
		String[] result = pattern.split(text);

		for (String temp : result)
			System.out.println(temp);

	}

}
