package cases;

public class LeapYear {
	private int year;

	public void setYear(int year) {
		if(year<0) {
			System.out.println("��������ȷ�����");
			this.year = 1;
		}else {
			this.year = year;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void isLeapYear(int year) {
		setYear(year);
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��ƽ��");
		}
	}
	
	public static void main(String[] args) {
		LeapYear y = new LeapYear();
		y.isLeapYear(2020);
	}
}
