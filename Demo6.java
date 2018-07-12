package homework03;
//需求说明：正确使用多重if选择结构，根据输入的考试成绩输出如图所示的成绩评测效果。
//（当成绩大于等于80分时成绩评测为“良好”，当成绩小于80分但是大于等于60分时成绩评测为“中等”，
//否则成绩评测为“差”。）

import java.util.Scanner;
public class Demo6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入分数：");
		int grade=input.nextInt();
		if(grade>80){
			System.out.println("良好");
			
		}else if(grade<80 && grade>60){
			System.out.println("中等");
			
		}else{
			System.out.println("差");
		}
	}
	
}