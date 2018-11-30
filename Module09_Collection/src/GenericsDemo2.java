import java.util.*;

public class GenericsDemo2 {
	
	public static void print(List<? extends Number> list) {
		// only Number calss' child calsses can be input 
		Iterator<?> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1212);
		list1.add(121);
		list1.add(153);
		list1.add(2);
		
		List<Double> list2 = new ArrayList<>();
		list2.add(1212.0);
		list2.add(1.222);
		list2.add(121.66666);
		
		List<String> list3 = new ArrayList<>();
		list3.add("bvc32");
		list3.add("kkk");
		list3.add("aaa");
		
		print(list1);
		print(list2);
		//print(list3);	
		
		Iterator<String> iter = list3.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
	} //end of main

} // end of class
