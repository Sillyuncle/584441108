package CardNo;
//使用Scanner类获取键盘输入的会员卡号“8349”，并将该数据存储在变量中



import java.util.Scanner;
public class CardNo {
		public static void main(String[] args){
			int number;
			
			System.out.println("请输入4位会员卡号： ");
			Scanner input=new Scanner(System.in);  //获取键盘输入的内容
			number=input.nextInt();				//将输入的数值储存在变量中
			
			System.out.println("会员卡号是： "+number);
			}
}

