package cases;

import java.util.Scanner;

public class Inverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����λ����:");
		int num = sc.nextInt();
		if(num<1000||num>9999) {
			System.out.println("��������Ч����λ����!");
		}else {
			int a = num/1000; //��ȡǧλ����
			int b = (num%1000)/100; //��ȡ��λ����
			int c = (num%100)/10; //��ȡʮλ����
			int d = num%10; //��ȡ��λ����
			num = d*1000+c*100+b*10+a;
			System.out.println("����λ����������Ϊ:"+num);
		}
	}
}
