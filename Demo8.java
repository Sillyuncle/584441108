package homework03;			

						//使用嵌套if选择结构
//
//需求说明：正确使用嵌套if选择结构，实现根据比赛成绩以及性别，对选手进行分组，
//效果如下图所示。当成绩小于等于“10秒”时，选手有资格进入决赛，
//对于进入决赛的选手再对性别“男和女”分别进入“男子组决赛”或“女子组决赛”。

import java.util.Scanner;
public class Demo8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入成绩：    ");
		if(!input.hasNextFloat()){
			System.out.println("输入不合法！");  //若不输入数字 则不合法，该语句要在数值储存之前
			return;
		}
		Float time=input.nextFloat();
		
		if(time<=10){
			System.out.println("请输入性别");
			if(input.hasNextFloat()){
				System.out.println("输入不合法！");   //输入数字则不合法
				return;
			}
			String sex=input.next();
			System.out.println((sex.equals("男")?"进入男子组决赛":"进入女子组决赛"));

		}else{
			System.out.println("很遗憾没有进入决赛");
		}
	}
}