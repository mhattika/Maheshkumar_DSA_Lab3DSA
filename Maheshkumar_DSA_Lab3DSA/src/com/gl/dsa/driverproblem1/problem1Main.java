package com.gl.dsa.driverproblem1;

import com.gl.dsa.problem1.BalanceBrackets;

public class problem1Main {

	public static void main(String[] args) {
		String expr = "([[{}]])";
		//String expr="([[{}]]))"; 
		BalanceBrackets bb = new BalanceBrackets();
		boolean res = bb.isStringBalanced(expr);
		if (res) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
