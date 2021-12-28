import java.util.Stack;
public class StackCalc {
	
	//variables
	
	Stack<String> stack = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	String result;
	boolean isNumber;
	
	//create answer() method
	public String answer() {
		for(int i = 0; i < 5 ; i++) {
			String n = stack.elementAt(i);
			char[] temp = n.toCharArray();
			isNumber = Character.isDigit(temp[0]);
			
			if(isNumber == true) {
				stack2.push(n);
			}
			if(isNumber == false) {
				String oper = stack.get(i);
				
				String num1 = stack2.pop();
				String num2 = stack2.pop();
				math(num1, num2, oper);
			}
				
		}
		return stack2.firstElement();
			
	}
	
	//math method (parameters num1,num2, and the operator
	public void math(String num1,String num2, String n) {
		
		int isNum1 = Integer.parseInt(num1);
		int isNum2 = Integer.parseInt(num2);
		int answer = 0;
		
		if(n == "+") {
			answer = isNum1 + isNum2;
		}
		if(n == "*") {
			answer = isNum1 * isNum2;
		}
		if(n == "/") {
			answer = isNum1 / isNum2;
		}
		if(n == "-") {
			answer = isNum1 - isNum2;
		}
		String convertString = Integer.toString(answer);
		stack2.push(convertString);
		
	}

}
