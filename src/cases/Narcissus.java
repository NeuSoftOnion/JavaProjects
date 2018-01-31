package cases;

public class Narcissus {
	public static void main(String[] args) {
		for(int num=100;num<=999;num++) {
			int a = num/100; //获取百位数字
			int b = num%100/10; //获取十位数字
			int c = num%10; //获取个位数字
			int n = a*a*a+b*b*b+c*c*c;
			if(num==n) {
				System.out.print("["+num+"] ");
			}
		}
	}
}
