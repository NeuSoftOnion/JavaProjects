package cases;

public class Narcissus {
	public static void main(String[] args) {
		for(int num=100;num<=999;num++) {
			int a = num/100; //��ȡ��λ����
			int b = num%100/10; //��ȡʮλ����
			int c = num%10; //��ȡ��λ����
			int n = a*a*a+b*b*b+c*c*c;
			if(num==n) {
				System.out.print("["+num+"] ");
			}
		}
	}
}
