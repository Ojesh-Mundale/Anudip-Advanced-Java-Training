package com.dsa.collections;

import java.util.Collections;
import java.util.Vector;

public class ComparatorVsComparable {
	public static void main(String[] args) {
		method1();

		Employee e1 = new Employee();
	}

	private static void method1() {
		Vector<Integer> list = new Vector<Integer>();
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		Collections.sort(list);
		for (Integer i : list) {
			System.out.println(i);
		}

	}
}
