package interviewpractice;

import java.util.Stack;

public class CheckParenthesis {
	
	public static boolean isParenMatching(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOpening(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatching(stack.peek(), c)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="(){}}";
		boolean result = isParenMatching(s);
		System.out.println("Parentheses matching: " + result);

	}

}