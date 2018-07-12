package Number;

import java.util.Scanner;
public class Number {
	public static void main(String[] args){
		String name;
		int number;
		System.out.print("请输入姓名： ");
		Scanner input=new Scanner(System.in);
		name=input.next();
		System.out.print("请输入号码： ");
		Scanner input2=new Scanner(System.in);
		number=input2.nextInt();
		System.out.print(""+name+"你好！！");
		System.out.println("您的等待号码为： "+number);
		}
}
