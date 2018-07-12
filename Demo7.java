package homework05;
/*
需求说明：使用for循环循环输出对应数字的加法表，效果如图所示。
                  这里的for循环中使用两个循环变量，一个从0开始自增（++）循环，一个从键盘录入的值自减（--）循环。
*/

import java.util.*;
public class Demo7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个值:");
		int num=input.nextInt();
		System.out.println("根据这个值可输出以下加法表");
		for (int i = 0, j=num; i <=num; i++,j=(num-i)) {
			System.out.println(i+"+"+j+"="+num);
		}
	}
}
