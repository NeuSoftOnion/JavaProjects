package cases;

public class Overload {
	/*
	 * ��������:��������ͬ,�����б�ͬ(1����������;2��������������;3��������������˳��)
	 * 		     �뺯������ֵ�����޹�
	 * */
	public int add(int a) {
		return a;
	}
	public int add(int a,int b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public char add(char a,int b) {
		return (char) (a+b);
	}
	public int add(int b,char a) {
		return a+b;
	}
	public static void main(String[] args) {
		Overload num = new Overload();
		int a = num.add(1);
		int b = num.add(2, 4);
		float c = num.add(7f, 8.90f);
		int d = num.add(1, 'a');
		char e = num.add('A', 1);
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}
}
