package com.djava.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Канкулятор");
		Scanner scan = new Scanner(System.in);
		System.out.print("Веди 1 число: ");
		int a = scan.nextInt();
		System.out.print("Веди 2 число: ");
		int b = scan.nextInt();
		System.out.print("Веди опирацию: ");
		String st = scan.next();
		
		
			
		String result = operation(a, b, st);
		System.out.println(result);
		scan.close();
		
	}
	
	public static String operation(int a, int b, String st) {
		if(st.equals("+")) {
			System.out.print(a + b);
		} else if(st.equals("-")) {
			System.out.print(a - b);
		} else if(st.equals("*")) {
			System.out.print(a * b);
		} else if(st.equals("/")) {
			if(b == 0) {
				System.out.println("На ноль делить нельзя");
			} else {
				System.out.print(a / b);
			}
		} else if(!(st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/"))) {
			System.out.println("Такой оприрации не существует");
		}
		return "";
	}
}
