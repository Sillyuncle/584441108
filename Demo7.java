package homework03;

						//使用多重if实现购车

//需求说明：正确使用多重if选择结构，实现根据存款和购买能力的对应关系
//（当存款大于等于500万时买“凯迪拉克”，当存款大于等于100万时买“帕萨特”，
//当存款大于等于50万时买“伊兰特”，当存款大于等于10万时买“奥拓”，否则只能买“捷安特”）
//输出与之对应可以购买的车型，当存款为52万时输出如图所示的效果。（使用多重if选择语句处理问题时需要注意顺序）

import java.util.Scanner;
public class Demo7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入存款（万）：    ");
		Float money=input.nextFloat();
		if(money>=500){
			System.out.println("我可以买辆凯迪拉克");
			
		}else if(money>=100){
			System.out.println("我可以买辆帕萨特");
			
		}else if(money>=50){
			System.out.println("我可以买辆伊兰特");
			
		}else if(money>=10){
			System.out.println("我可以买辆奥拓");
			
		}else{
			System.out.println("我可以买捷安特");
		}
	}
	
}