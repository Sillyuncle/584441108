package Day1work15;

import java.util.Scanner;
public class Day1work15 {
		public static void main(String[] args){
			int number;
			
			System.out.println("������4λ��Ա���ţ� ");
			Scanner input=new Scanner(System.in);  //��ȡ�������������
			number=input.nextInt();				//���������ֵ�����ڱ�����
			
			int th=number/1000;
			int hu=number%1000/100;				//��ȥ��ǧλ������ȥ��ʮλ�͸�λ
			int te=number%100/10;
			int si=number%10;
			int whole=th+hu+te+si;
			
			System.out.print("ǧλ���ǣ�"+number/1000+",");
			System.out.print("��λ���ǣ�"+number%1000/100+",");
			System.out.print("ʮλ���ǣ�"+number%100/10+",");
			System.out.print("��λ���ǣ�"+number%10+"\n");
			System.out.print("��Ա����"+number+"��λ֮��Ϊ�� "+whole);
			}
}