
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,String> tel = new HashMap<>();
		tel.put("Mary", "0945764318");
		tel.put("Bob", "0965312875");
		tel.put("Jack", "0988421336");
		
		String tel1 = tel.get("Bob");
		System.out.println(tel1);
		
		for(String key : tel.keySet())
			System.out.println(key);
		
		for(String value : tel.values())
			System.out.println(value);
		
	} // end of main

} // end of class
