package com.example.java_demo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class LambTest {

	public static boolean getElement(ArrayList<Integer> numbers, int element) {
		AtomicBoolean exists = new AtomicBoolean(false);
		numbers.forEach((n) -> {
			if (n == element) {
				exists.set(true);
			}
		});
		if (!exists.get()) {
			System.out.println("Element does not exist");
		} else {
			System.out.println("Element exists");
		}
		return exists.get();
	}

	// operation is implemented using lambda expressions
	interface FuncInter1 {
		int operation(int a, int b);
	}

	interface FuncInter2 {
		void sayMessage(String message);
	}

	// Performs FuncInter1's operation on 'a' and 'b'
	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}

	public static void callingMethod() {
		FuncInter1 add = (int x, int y) -> x + y;
		FuncInter1 multiply = (int x, int y) -> x * y;
		LambTest tobj = new LambTest();
	}
}

