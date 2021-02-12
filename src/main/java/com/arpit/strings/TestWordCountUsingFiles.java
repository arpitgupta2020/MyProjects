package com.arpit.strings;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordCount {

	public void countWord(FileInputStream fis) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String readLine = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		while ((readLine = br.readLine()) != null) {
			String[] words = readLine.split(" ");

			for (String s : words) {

				Matcher hasSpecial = special.matcher(s);

				if (!hasSpecial.find()) {

					if (map.containsKey(s)) {
						map.put(s, map.get(s) + 1);
					} else {
						map.put(s, 1);
					}
				}
			}
		}
		Set<String> s = map.keySet();

		for (String s1 : s) {
			if (map.get(s1) > 0) {
				System.out.println(s1 + "  " + "duplicated" + "  " + map.get(s1) + "  " + "time/times");
			}
		}

	}
}

public class TestWordCountUsingFiles {

	public static void main(String[] args) throws Exception {

		WordCount countOfWords = new WordCount();
		FileInputStream fis = new FileInputStream("WordCountFile.txt");
		countOfWords.countWord(fis);

	}

}
