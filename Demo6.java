package homework05;
/*
							����5�ſγ̵�ƽ����
����˵�������Ȼ�ȡ����¼���ѧ��������Ȼ����ȷʹ��forѭ����ѭ����ȡĳͬѧ��S1��ҵ���Ե�5�ſγɼ���
	       ������ƽ���ֲ������Ч����ͼ��ʾ��Yes:��ʾ�������룬����������ʾ�˳�ѭ��������ִܷ���>700���Զ��˳�ѭ��
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
				System.out.print("������ѧ������:");
				String name = input.next();
				for (i = 1; i <= 5; i++) {
					System.out.println("�������" + i + "�ſ��Գɼ��� ");
					//����Ϸ���
					if (!input.hasNextInt()) {
						System.out.println("���벻�Ϸ�������������");
						continue;
					}
					number = input.nextInt();
					if (number < 0) {
						System.out.println("��Ǹ������¼����������½���¼��");
						return;
					}
					//�����ֺܷ�ƽ����
					sum += number;
					avg = sum / i;
					//�ж��ܷ��Ƿ����700
					if (sum > 700) {
						System.out.println("���벻�Ϸ����ֳܷ���700");
						return;
					} 
				}
				System.out.println("���ſ��Ե�ƽ����Ϊ��" + avg);
				System.out.println("��������?(YES/NO)");
				answer=input.next();
				
			} while (answer.equalsIgnoreCase("yes"));
		}
}