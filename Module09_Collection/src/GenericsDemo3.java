//import java.util.*;

public class GenericsDemo3 {
	
	public static void main(String[] args) {
		
		Mystack<Integer> s = new Mystack<>();
		
		s.push(5);
		s.push(58);
		s.push(541);
		s.push(88888);
		System.out.println(s.pop());
		System.out.println(s);
		
		Mystack<String> s2 = new Mystack<>();
		s2.push("Hello");
		s2.push("123");
		
/*		for(int i : s)
			System.out.println(i);
*/
		//Iterator<Integer> objs = s.iterator();
		
	} //end of main

} // end of class
