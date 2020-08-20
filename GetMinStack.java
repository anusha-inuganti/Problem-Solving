import java.util.Stack;

 class MyStack {
	
	Stack<Integer> s;
	Integer min;
	
	void getMin() {
		System.out.println(min);
		
	}
	
	Integer pop() {
		int x=s.pop();
		if(x>min)
			return x;
		else {
			min=2*min-x;
			return x;
		}
			
	}
	void push(Integer x) {
		if(s.isEmpty())
		{	s.push(x);
		min=x;
		return;
		}
		
		 if(x>min)
		s.push(x);
		else {
			//min=x;
			s.push(2*x-min);
			min=x;
		}
	}

	public MyStack() {
		super();
		s=new Stack<Integer>();
	}
}

 public class GetMinStack {
	public static void main(String args[]) {
	MyStack s=new MyStack();	
	s.push(3); 
    s.push(5); 
    s.getMin(); 
    s.push(2); 
    s.push(1); 
    s.getMin(); 
    s.pop(); 
    s.getMin(); 
    s.pop(); 
    //s.peek(); 
	}

}
