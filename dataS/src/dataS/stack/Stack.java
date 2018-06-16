package dataS.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		top = -1;
	
	}
	 public void push(int j){
		 top++;
		 stackArray[top] = j;
	 }
	 public long pop(){
		 int oldTop = top;
		 top--;
		 return stackArray[oldTop];
	 }

}
