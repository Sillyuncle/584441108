package homework03;

//����˵������ȷʹ��if-elseѡ��ṹ
//���ɼ�����90�ָ��轱����������гͷ���

import java.util.*;
public class Demo5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����������");
		int grade=input.nextInt();
		if(grade>90){
			System.out.println("����һ��iphoneX");
		}else{
			System.out.println("�ͷ���5��������");
		}
	}
	
}
