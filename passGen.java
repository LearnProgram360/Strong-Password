package com.learnprogram.passgen;

import java.util.Random;
import java.util.Scanner;

public class passGen {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the length of password: ");
			int x = sc.nextInt();
			System.out.println(genPass(x));
		}
	}

	private static char[] genPass(int len)
	{
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String special="!@#$%&*";
		String combinationOfAll=caps+lower+special+num;
		
		Random random=new Random();
		char[] pass=new char[len];
		pass[0]=lower.charAt(random.nextInt(lower.length()));
		pass[1]=caps.charAt(random.nextInt(caps.length()));
		pass[2]=special.charAt(random.nextInt(special.length()));
		pass[3]=num.charAt(random.nextInt(num.length()));
		
		for(int i=4; i<len; i++)
			pass[i]=combinationOfAll.charAt(random.nextInt(combinationOfAll.length()));
		return pass;
	}
}
