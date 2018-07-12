package homework05;
/*
							计算5门课程的平均分
需求说明：首先获取键盘录入的学生姓名，然后正确使用for循环，循环获取某同学的S1结业考试的5门课成绩，
	       最后计算平均分并输出，效果如图所示。Yes:表示继续输入，其他按键表示退出循环（如果总分大于>700）自动退出循环
*/
import java.util.Scanner;
public class Demo6{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			int number;
			int i;
			int sum=0;
			int avg=0;
			String answer;
			
			do {
				System.out.print("请输入学生姓名:");
				String name = input.next();
				for (i = 1; i <= 5; i++) {
					System.out.println("请输入第" + i + "门考试成绩： ");
					//输入合法化
					if (!input.hasNextInt()) {
						System.out.println("输入不合法！请输入数字");
						continue;
					}
					number = input.nextInt();
					if (number < 0) {
						System.out.println("抱歉，分数录入错误，请重新进行录入");
						return;
					}
					//计算总分和平均分
					sum += number;
					avg = sum / i;
					//判断总分是否大于700
					if (sum > 700) {
						System.out.println("输入不合法，总分超过700");
						return;
					} 
				}
				System.out.println("五门考试的平均分为：" + avg);
				System.out.println("继续输入?(YES/NO)");
				answer=input.next();
				
			} while (answer.equalsIgnoreCase("yes"));
		}
}