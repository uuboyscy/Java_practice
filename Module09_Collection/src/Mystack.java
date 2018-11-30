import java.util.*;

public class Mystack<T> {
	
	List<T> list = new ArrayList<>();
	Iterator<T> objs = list.iterator();
	
	public void push(T val) {
		list.add(val);
	}
	public T pop() {
		return list.remove(list.size()-1);
	}
	public void iter() {
		
	}
	
	
} // end of class
