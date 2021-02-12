package com.arpit.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*public class DuplicateTest {
	public static void main(String a[]) {
		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]== arr2[j]) {
					System.out.println(arr1[i]);
				}

			}
		}
	}
}*/
/*public class DuplicateTest {
    static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {

        insertNameAndQuantity("A", 10);
        insertNameAndQuantity("B", 25);
        insertNameAndQuantity("A", 25);
        System.out.println(map);
    }

    public static void insertNameAndQuantity(String key, Integer value) {

        Integer count = map.get(key);
        System.out.println("COUNT"+count);
        if (count == null)
            map.put(key, value);
        else
            map.put(key, count + value);

    }
}*/

public class DuplicateTest {
	public static void main(String a[]) {
Set<Integer> abc = new TreeSet<Integer>(Arrays.asList(new Integer[]{4,7,3,9,2}));
Set<Integer> bcd = new TreeSet<Integer>(Arrays.asList(new Integer[]{3,2,12,9,40,32,4}));

//union
Set<Integer> c = new TreeSet<Integer>(abc);
c.addAll(bcd);
System.out.println(c);

//intersection
Set<Integer> d = new TreeSet<Integer>(abc);
d.retainAll(bcd);
System.out.println(d);



//difference
Set<Integer> e = new TreeSet<Integer>(abc);
Set<Integer> k = new TreeSet<Integer>(bcd);
e.removeAll(bcd);
k.removeAll(abc);
Set<Integer> add = new TreeSet<Integer>(e);
add.addAll(k);
System.out.println(add);


//reverse
List<Integer> list = new ArrayList<Integer>(abc);
java.util.Collections.reverse(list);
System.out.println(list);
	}
}
