package homework03;

						//ʹ�ö���ifʵ�ֹ���

//����˵������ȷʹ�ö���ifѡ��ṹ��ʵ�ָ��ݴ��͹��������Ķ�Ӧ��ϵ
//���������ڵ���500��ʱ�򡰿������ˡ����������ڵ���100��ʱ�������ء���
//�������ڵ���50��ʱ�������ء����������ڵ���10��ʱ�򡰰��ء�������ֻ���򡰽ݰ��ء���
//�����֮��Ӧ���Թ���ĳ��ͣ������Ϊ52��ʱ�����ͼ��ʾ��Ч������ʹ�ö���ifѡ����䴦������ʱ��Ҫע��˳��

import java.util.Scanner;
public class Demo7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("��������򣩣�    ");
		Float money=input.nextFloat();
		if(money>=500){
			System.out.println("�ҿ���������������");
			
		}else if(money>=100){
			System.out.println("�ҿ�������������");
			
		}else if(money>=50){
			System.out.println("�ҿ�������������");
			
		}else if(money>=10){
			System.out.println("�ҿ�����������");
			
		}else{
			System.out.println("�ҿ�����ݰ���");
		}
	}
	
}