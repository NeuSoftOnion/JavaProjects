package implement;

public class Engineer {
	private Programmer programmer;

	public Programmer getProgrammer() {
		return programmer;
	}

	public void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}

	public void program() {
		 programmer.program();
	}
}
