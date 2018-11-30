

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		@SuppressWarnings("unused")
		Set<Integer> set1 = new HashSet<>();
		set.add(34);
		set.add(34); // duplicate, is not add
		set.add(25);
		set.add(28);
		//set.add("Hello"); // error
		System.out.println(set);
		System.out.println(set.size());
		Iterator<Integer> objs = set.iterator();
		
		while(objs.hasNext())
			System.out.println(objs.next()); // unboxing
		
		for(Integer i : set)
			System.out.println(i);
		
	} // end of main

} // end of class
