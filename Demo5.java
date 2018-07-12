package homework03;

//需求说明：正确使用if-else选择结构
//当成绩大于90分给予奖励，否则进行惩罚。

import java.util.*;
public class Demo5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入分数：");
		int grade=input.nextInt();
		if(grade>90){
			System.out.println("奖励一部iphoneX");
		}else{
			System.out.println("惩罚蹲5分钟马步！");
		}
	}
	
}
