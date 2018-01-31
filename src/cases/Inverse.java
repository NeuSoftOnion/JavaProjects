package cases;

import java.util.Scanner;

public class Inverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个四位整数:");
		int num = sc.nextInt();
		if(num<1000||num>9999) {
			System.out.println("请输入有效的四位整数!");
		}else {
			int a = num/1000; //获取千位数字
			int b = (num%1000)/100; //获取百位数字
			int c = (num%100)/10; //获取十位数字
			int d = num%10; //获取个位数字
			num = d*1000+c*100+b*10+a;
			System.out.println("该四位整数的逆数为:"+num);
		}
	}
}
