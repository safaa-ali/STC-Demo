package com.example.stc.demo.problem.solving;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseSubstrings {
	public static String reverseParentheses(String s) {
		// 1 <= s.length <= 2000
		if (s.length() >= 1 || s.length() <= 2000) {
			s = s.toLowerCase();
			Stack<Character> stack = new Stack<>();
			for (char c : s.toCharArray()) {
				if (c == ')') {
					Queue<Character> queue = new LinkedList<>();
					while (!stack.isEmpty() && stack.peek() != '(') {
						queue.add(stack.pop());
					}
					if (!stack.isEmpty()) {
						stack.pop();
					}
					Character f = new Character('(');
					Character l = new Character(')');

					stack.push(f);
					while (!queue.isEmpty()) {
						stack.push(queue.remove());
					}
					stack.push(l);

				} else {
					stack.push(c);
				}
			}
			StringBuilder sb = new StringBuilder();
			while (!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			return sb.reverse().toString();

		}
		return s;
	}

}
