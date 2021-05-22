package com.arpit.latestPractisePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.base.Functions;

/**
* Arpit Gupta
*/
public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		
		String infra[] = {"Amazon", "GCP", "Azure", "AliBaba", "Java", "Amazon","GCP","AWS", "Azure", "Java"};
	
		//Method1
		System.out.println("**********BruteForce**************");
		for(int i=0; i< infra.length; i++) {
			for(int j=i+1; j< infra.length; j++) {
				if(infra[i].equalsIgnoreCase(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}
		System.out.println();
		
		//Method2
		System.out.println("**********HashSet**************");
		Set<String> data= new HashSet<>();
		for(String s:infra) {
			if(!data.add(s)) {
				System.out.println(s);
			}
		}
		
		//Method3
		System.out.println();
		System.out.println("**********HashMap**************");
		Map<String, Integer> freq= new HashMap<>();
		for(String s: infra) {
			freq.put(s, freq.getOrDefault(s, 0)+1);
		}
		for(String s: freq.keySet()) {
			if(freq.get(s) > 1) {
				System.out.println(s);
			}
		}
		
		//Method4
		System.out.println();
		System.out.println("**********Java8 Streams**************");
		Set<String> dataSet= new HashSet<>();
		
		Set<String> duplicates=Arrays.asList(infra)
										.stream()
											.filter(e -> !dataSet.add(e))
												.collect(Collectors.toSet());
		System.out.println(duplicates);
		
		//Method5
		System.out.println();
		System.out.println("**********Java8 Streams with Grouping by**************");
		
		
		Set<String> duplicateSet= Arrays.asList(infra).stream()
						.collect(Collectors.groupingBy(Functions.identity(), Collectors.counting()))
							.entrySet()
								.stream()
									.filter(e -> e.getValue() > 1)
										.map(Map.Entry::getKey)
											.collect(Collectors.toSet());
		
		System.out.println(duplicateSet);
		
		//Method6
		System.out.println();
		System.out.println("**********Java8 Streams using Frequency**************");
		List<String> dataList= Arrays.asList(infra);
		
		Set<String> elementSet= dataList.stream()
											.filter(e -> Collections.frequency(dataList, e) > 1)
												.collect(Collectors.toSet());
		System.out.println(elementSet);
	}

}
