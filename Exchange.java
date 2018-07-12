package Exchange;

public class Exchange {
	public static void main(String[] args){
		int num1=5;
		int num2=6;
		System.out.println("交换前：");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		int A=num1;							//引入第三个常量进行交换
		num1=num2;
		num2=A;
		System.out.println("交换后：");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
}
