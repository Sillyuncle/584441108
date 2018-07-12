package Day1work15;

import java.util.Scanner;
public class Day1work15 {
		public static void main(String[] args){
			int number;
			
			System.out.println("请输入4位会员卡号： ");
			Scanner input=new Scanner(System.in);  //获取键盘输入的内容
			number=input.nextInt();				//将输入的数值储存在变量中
			
			int th=number/1000;
			int hu=number%1000/100;				//先去除千位数。再去除十位和个位
			int te=number%100/10;
			int si=number%10;
			int whole=th+hu+te+si;
			
			System.out.print("千位数是："+number/1000+",");
			System.out.print("百位数是："+number%1000/100+",");
			System.out.print("十位数是："+number%100/10+",");
			System.out.print("个位数是："+number%10+"\n");
			System.out.print("会员卡号"+number+"各位之和为： "+whole);
			}
}