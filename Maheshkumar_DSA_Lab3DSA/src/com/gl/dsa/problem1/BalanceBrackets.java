package com.gl.dsa.problem1;

import java.util.Stack;

public class BalanceBrackets {

	public static boolean isStringBalanced(String bracktExpression) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < bracktExpression.length(); i++) {
			char ch = bracktExpression.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char c;
			switch (ch) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			default:
				break;
			}

		}
		return (stack.isEmpty());
	}

}
