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
		System.out.println(this.getName()+"������è��");
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("�¹�Բ");
		cat.walk();
	}
}
