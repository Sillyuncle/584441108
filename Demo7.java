package homework05;
/*
����˵����ʹ��forѭ��ѭ�������Ӧ���ֵļӷ���Ч����ͼ��ʾ��
                  �����forѭ����ʹ������ѭ��������һ����0��ʼ������++��ѭ����һ���Ӽ���¼���ֵ�Լ���--��ѭ����
*/

import java.util.*;
public class Demo7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��ֵ:");
		int num=input.nextInt();
		System.out.println("�������ֵ��������¼ӷ���");
		for (int i = 0, j=num; i <=num; i++,j=(num-i)) {
			System.out.println(i+"+"+j+"="+num);
		}
	}
}
