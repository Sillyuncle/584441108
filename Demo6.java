package homework03;
//����˵������ȷʹ�ö���ifѡ��ṹ����������Ŀ��Գɼ������ͼ��ʾ�ĳɼ�����Ч����
//�����ɼ����ڵ���80��ʱ�ɼ�����Ϊ�����á������ɼ�С��80�ֵ��Ǵ��ڵ���60��ʱ�ɼ�����Ϊ���еȡ���
//����ɼ�����Ϊ�������

import java.util.Scanner;
public class Demo6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����������");
		int grade=input.nextInt();
		if(grade>80){
			System.out.println("����");
			
		}else if(grade<80 && grade>60){
			System.out.println("�е�");
			
		}else{
			System.out.println("��");
		}
	}
	
}