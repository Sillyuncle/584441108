package homework03;			

						//ʹ��Ƕ��ifѡ��ṹ
//
//����˵������ȷʹ��Ƕ��ifѡ��ṹ��ʵ�ָ��ݱ����ɼ��Լ��Ա𣬶�ѡ�ֽ��з��飬
//Ч������ͼ��ʾ�����ɼ�С�ڵ��ڡ�10�롱ʱ��ѡ�����ʸ���������
//���ڽ��������ѡ���ٶ��Ա��к�Ů���ֱ���롰�������������Ů�����������

import java.util.Scanner;
public class Demo8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������ɼ���    ");
		if(!input.hasNextFloat()){
			System.out.println("���벻�Ϸ���");  //������������ �򲻺Ϸ��������Ҫ����ֵ����֮ǰ
			return;
		}
		Float time=input.nextFloat();
		
		if(time<=10){
			System.out.println("�������Ա�");
			if(input.hasNextFloat()){
				System.out.println("���벻�Ϸ���");   //���������򲻺Ϸ�
				return;
			}
			String sex=input.next();
			System.out.println((sex.equals("��")?"�������������":"����Ů�������"));

		}else{
			System.out.println("���ź�û�н������");
		}
	}
}