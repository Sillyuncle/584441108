package com.hpit.demo;

public class Demo2 {
	public static void main(String[] args) {
		for (int i = 0; i < 40; i++) {
			/*
			 * 当i=0,内层循环j循环4次？？
			 * i=1,内层循环循环4次
			 * 
			 */
			for (int j = 0; j < 4; j++) {
				System.out.print("*  ");
			}
			//换行
			System.out.println();
		}
		
		/*//打印第二行
		for (int i = 0; i < 4; i++) {
			System.out.print("*  ");
		}
		
		System.out.println();
		
		//打印第三行
		for (int i = 0; i < 4; i++) {
			System.out.print("*  ");
		}
		System.out.println();*/
	}
}
