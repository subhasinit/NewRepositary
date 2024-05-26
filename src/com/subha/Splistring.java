package com.subha;

public class Splistring {
	public static void main(String[] args)
	{//custom input string
		String str="subha@shini";
		String[] ss = str.split("@",2);
		for(String a:ss)
		{
			System.out.println(a);
		}
	}

}
