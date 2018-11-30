/*
 * 3.	例外處理的練習-Stack
產生一個class名為Stack，有兩個成員變數分別為一int陣列(用以存放資料)和top(int) (用以標示目前最上層資料的註標值)；有兩個成員方法push()和pop()，分別用來放資料和取資料。
產生兩個exception class名為StackEmptyException和StackFullException，分別用來處理Stack空的和滿的狀況。
提示：Stack以先進後出(First In Last Out)的方式存取資料。
 */

package stack;

import java.util.Scanner;

public class Stack {

	private int[] data;
	private int top;
	private int pointer;
	
	public Stack(int x) {
		data = new int[x];
	}
	
	/*setter and getter*/
	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public int getTop() {
		return top;
	}
	/*setter and getter*/

	
	/*method*/
	public void push(int x) 
	throws StackFullException{
		if(pointer == data.length)
			throw new StackFullException();
		data[pointer] = x;
		this.pointer++;
	}
	
	public int pop() 
	throws StackEmptyException{
		if(pointer == 0)
			throw new StackEmptyException();
		--pointer;
		return data[pointer];
	}
	/*method*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Stack s = new Stack(5);
		int inp = 3;
		int p = 0;
		
		while(inp != 0) {
			System.out.println("-------------------------------------");
			System.out.println("1.push   2.pop   3.Show the data.   0.exit");			
			inp = scanner.nextInt();			
			if(inp == 1) {
				try {
					System.out.println("What you want to push in?");
					p = scanner.nextInt();
					s.push(p);
				}catch(StackFullException k) {
					System.err.println("Full");
				}
			} // if 1
			if(inp == 2) {
				try {
					System.out.println(s.pop() + " removed.");
				}catch(StackEmptyException k) {
					System.err.println("Empty");
				}
			} // if 2
			if(inp == 3) {
				for(int i = 0 ; i < s.pointer ; i++)
					System.out.print(s.data[i] + " ");
				System.out.println();
			}
			
			System.out.println("-------------------------------------");
			System.out.println();
			
		} // while != 0		
		
		scanner.close();
		
	} // end of main

} // end of class
