package lowLevelDesign.singleResponsibility;

public class Computer {

	private String name;
	private String modelNumber;
	private String powerRating;

	public Computer(String name, String modelNumber, String powerRating) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.powerRating = powerRating;
	}

	public void cpu() {

		System.out.println("Do Cpu functionality");

	}

	public void motherboard() {
		System.out.println("Do motherboard functionality");
	}

	public void ups() {
		System.out.println("Do ups functionality");
	}

	public void keyboard() {
		System.out.println("Do keyboard functionality");
	}

	public void mouse() {
		System.out.println("Do mouse functionality");
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", modelNumber=" + modelNumber + ", powerRating=" + powerRating + "]";
	}

}
