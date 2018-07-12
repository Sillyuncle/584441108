package com.hpit.demo;

import java.util.Scanner;

public class StudentDemo2 {
	public static void main(String[] args) {
//		System.out.println(12.0/0);//Infinity
//		System.out.println(12/0);//运算错误，程序出错
		
		Scanner input=new Scanner(System.in);
		//统计总分，然后计算平均分输出
		double sum=0;//保存总分
		int num=0;//保存及格人数
		for (int i = 0; i < 5; i++) {
			System.out.println("输入成绩:");
			double score = input.nextDouble();
			if(score<60){
				continue;
			}
			num++;
			sum+=score;//求和,只要求计算及格的人数
		}
		
		System.out.println("本次考试平均分是："+ (num==0?0:sum/num));
		//使用五个成绩。。。
	}
}
