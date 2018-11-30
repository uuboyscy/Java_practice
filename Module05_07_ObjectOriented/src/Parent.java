
public class Parent {

	int a;
	void method() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.a = 123;
		c.b = 456;
		c.method();
		c.method(5);
		
	}

}


class Child extends Parent {
	int b;
	void method(int x) {
		System.out.println(b);
	}
}