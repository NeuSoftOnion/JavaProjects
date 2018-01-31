package implement;

public class Main {
	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		Programmer java = new Java();
		Programmer ui = new UI();
		Programmer vr = new VR();
		engineer.setProgrammer(vr);
		engineer.program();
	}
}
