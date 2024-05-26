package com.subha;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class A {
	private int m1() {
		return 100;

	}

	private ArrayList<String> m2() {
		ArrayList<String> s = new ArrayList<>();
		s.add("ram");
		s.add("java");
		s.add("chennai");
		return s;
	}

	private Map<String, String> m4() {
		Map<String, String> m = new LinkedHashMap<>();
		m.put("name", "Bala");
		m.put("email", "Bala@gmail.com");
		m.put("course", "java");
		return m;

	}

	public static void main(String[] args) {
		A a = new A();
		int m1 = a.m1();
		System.out.println(m1);

		ArrayList<String> m2 = a.m2();
		System.out.println(m2);

		Map<String, String> m4 = a.m4();
		System.out.println(m4);
	}
}
