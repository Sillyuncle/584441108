package homework03;


						//���������µ�ifѡ��ṹ
//����˵�������ɼ��ж������Ƚϸ���ʱ��
//������Ҫͬʱ��Java�ɼ������ֳɼ�ͬʱ�����ж�ʱ������Ҫʹ�ø���������ifѡ��ṹ���Ƿ��������ж�
//����Java�ɼ�����90�������ֳɼ�����80�֣�����Java�ɼ�����100�������ֳɼ�����70��ʱ�����轱������
//���Ч������ͼ��ʾ��
//
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����źƵ�Java�ɼ���");
		int grade1=input.nextInt();
		System.out.println("�����źƵ����ֳɼ���");
		int grade2=input.nextInt();
		if(grade1>90 && grade2>80){
			System.out.println("��ʦ˵����������һ��iphoneX");
		}else if(grade1==100 && grade2>70){
			System.out.println("��ʦ˵����������һ��iphoneX");
		}else{
			System.out.println("��ȥ�ú�ѧϰ��");
		}
	}

}