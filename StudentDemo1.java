package com.hpit.demo;

import java.util.Scanner;

/*
 * 需求：
 * 实现重复的验证用户是否登录成功
 * 弊端：用户体验度
 * 解决问题：
 *   方案一：是否继续登录，输入over退出登录
 *   方案二：输入错误的情况，只允许出现3次。3次机会用完，程序自动退出
 * 循环：重复做同一件事情
 */
public class StudentDemo1 {
	public static void main(String[] args) {
		/*
		 * 分析：
		 * 1、一件事情一次做好
		 * 2、做好的事情上面套用循环
		 */
		Scanner input=new Scanner(System.in);
		String userName;
		String userPwd;
		
		/*if(1==1){
			//break只能用在switch和循环中（包含所有的循环）
			break;
		}*/
		
		/*do {
			//做一个登录功能
			System.out.print("用户名：");
			userName = input.next();
			System.out.print("密码：");
			 userPwd= input.next();
			if (userName.equals("admin") && userPwd.equals("admin")) {
				System.out.println("登录成功！");
			} else{
				System.out.println("账号或密码输入有误！请重新登录~~~");
				System.out.println("是否继续登录？输入over退出登录");
				if(input.next().equals("over")){
					
					//结束登录
					break;//出现在循环中，结束循环，让循环停止执行
				}
			}
		} while (!userName.equals("admin") || !userPwd.equals("admin"));*/
		
		
		//方案二：只有三次输入错误的机会
		for(int i=0;i<3;i++){
			//做一个登录功能
			System.out.print("用户名：");
			userName = input.next();
			System.out.print("密码：");
			 userPwd= input.next();
			if (userName.equals("admin") && userPwd.equals("admin")) {
				System.out.println("登录成功！");
				//终止循环，不用继续再登录
				break;//待条件终止循环。
//				return;//停止程序，使程序不再继续往后执行
			}			
			System.out.println("账号或密码输入有误！请重新登录~~~");		
		}
		//基于登录成功，再执行其他操作---取款  转账  查询
		
	}
}
