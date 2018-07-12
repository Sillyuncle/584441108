package homework03;


//需求说明：根据键盘输入的Java成绩，正确使用基本if选择结构对成绩进行判断
//（当成绩大于90分时，给予奖励），输出效果如图所示。（注意：条件表达式的结果必须是boolean值）


import java.util.*;
public class Demo3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入张浩的Java成绩：");
		int grade=input.nextInt();
		if(grade>90){
			System.out.println("老师说：不错！奖励一个iphoneX");
		}
	}

}
