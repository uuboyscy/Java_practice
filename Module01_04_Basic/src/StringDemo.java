
public class StringDemo {

	public static void main(String[] args) {
		
		String str = "Hello world, welcome to JAVA world.";
		
		System.out.println(str.charAt(6));		
		System.out.println(str.length());		
		System.out.println(str.substring(0, 8));
		
		
		System.out.println(str.indexOf("world"));		
		System.out.println(str.indexOf("World"));		
		System.out.println(str.indexOf("world", 30));
		
		int index = str.indexOf("world");
		System.out.println(index);			
		System.out.println(str.indexOf("world", index+1));
		
		System.out.println(str.lastIndexOf("world"));
		System.out.println(str.lastIndexOf(str));
		
		String[] tokens = str.split("");
		for(int i = 0 ; i < tokens.length ; i++)
			System.out.print(tokens[i] + "/");
		System.out.println("");
		tokens = str.split(",");
		for(int i = 0 ; i < tokens.length ; i++)
			System.out.print(tokens[i] + "/");
		System.out.println("");
		tokens = "Hello".split("");
		for(int i = 0 ; i < tokens.length ; i++)
			System.out.print(tokens[i] + "/");
		System.out.println("");

		System.out.println(str.startsWith("hello"));
		
		str = "2018/11/2";
		System.out.println(str.replace('/', '-'));
		
		String 	str1 = "Hello world", //see ascii code
				str2 = "hello world";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.toUpperCase());
		str1 = "                    Hello world    ";
		System.out.println(str1.trim());
		
	}

}
