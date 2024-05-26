package com.subha;

import java.util.Scanner;

public class Exestring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string:\n");
    	System.out.println("=================\n");
		String name=scan.next();
		System.out.println("string is:"+ name);
		int len = name.length();
		System.out.println("length is:"+ len);
	if (len==10)
	{ 
		System.out.println("valid string");
	}
	else
	{
		System.out.println("invalid string");

	}

}
}