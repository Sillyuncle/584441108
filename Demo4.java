package com.hpit.demo;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		//数组保存五个学生的成绩
		/*
		 * 数据类型[] 数组名=new 数据类型[数据个数];
		 * 注意：数组数据类型与存储数据的类型一致的
		 */
		int[] scores=new int[5];//定义并赋值
		//[I@100363:应用类型定义的变量，存储都是内存地址（也称为哈希地址）
		/*System.out.println(scores[0]);//scores==[I@100363
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);*/
		Scanner input=new Scanner(System.in);
		//数组重新赋值
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入成绩：");
			scores[i]=input.nextInt();
		}
		
		//打印数组
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//总分、平均分、最大值、最小值
		int sum=0;//总分
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("总分是："+sum+"，平均分："+sum/scores.length);
		
		//最大值
		//假设第一个数就是最大的
		int max=scores[0];
		for (int i = 1; i < scores.length; i++) {
			if(max < scores[i]){
				max=scores[i];
			}
		}
		
		System.out.println("最大值："+max);
		
		
	}
}
