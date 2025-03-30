class Car {
	private String model ;

	public String getModel() {
		return model;
	}

	public void setModel (String newModel) {
		this.model = newModel ;
	}
}

public class New {
	public static void main(String[] args) {
		Car c1 = new Car ();
		c1.setModel("Toyota Corolla");
		System.out.println(c1.getModel());
	}
}