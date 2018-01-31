package cases;

public class Cat {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println(this.getName()+"正在走猫步");
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("陈国圆");
		cat.walk();
	}
}
