package com.subha;

import com.beust.jcommander.Strings;

public class B5 extends A1 {
	private static void m3() {

		System.out.println("greens");
		m1();
		m2();
	}

	public static void main(String[] args) {
		B5 t = new B5();
		t.m3();
	}
}