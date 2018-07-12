package com.hpit.demo;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		do {
			System.out.println("输入要打印的星星的行数：");
			int rows = input.nextInt();
			for (int i = 1; i <= rows; i++) {
				for (int j = 0; j < rows - i; j++) {
					System.out.print("  ");
				}
				for (int k = 0; k < 2 * i - 1; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("输入over结束打印");
			if(input.next().equals("over")){
				//结束打印
				break;
			}
		} while (true);
			/*//一个循环控制空格
			for (int i = 0; i <4; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 3; i++) {
				//一个循环控制*
				System.out.print("*");
			}
			System.out.println();
			for (int i = 0; i <4; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 3; i++) {
				//一个循环控制*
				System.out.print("*");
			}*/
		
	}
}
