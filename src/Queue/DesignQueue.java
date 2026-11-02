package Queue;

import java.util.Stack;

public class DesignQueue {
	
	Stack<Integer> input=new Stack<>();
	Stack<Integer> output=new Stack<>();
	
	public void push(int val) {
		input.push(val);
	}
	
	public int peek() {
		if(input.empty()) {
			while(!input.empty()) {
				output.push(input.pop());
			}
		}
		return output.peek();
	}
	
	public int pop() {
		peek();
		return output.peek();
	}

	public static void main(String[] args) {
		

	}

}
