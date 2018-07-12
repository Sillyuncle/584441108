package homework03;


						//复杂条件下的if选择结构
//需求说明：当成绩判断条件比较复杂时，
//比如需要同时对Java成绩和音乐成绩同时进行判断时，就需要使用复杂条件的if选择结构对是否奖励进行判断
//（当Java成绩大于90分且音乐成绩大于80分，或者Java成绩等于100分且音乐成绩大于70分时，给予奖励），
//输出效果如下图所示。
//
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入张浩的Java成绩：");
		int grade1=input.nextInt();
		System.out.println("输入张浩的音乐成绩：");
		int grade2=input.nextInt();
		if(grade1>90 && grade2>80){
			System.out.println("老师说：不错！奖励一个iphoneX");
		}else if(grade1==100 && grade2>70){
			System.out.println("老师说：不错！奖励一个iphoneX");
		}else{
			System.out.println("回去好好学习！");
		}
	}

}