
public class Body {

	private String model;
	private String color;
	private int age;
	
	public Body(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public Body(String model, String color, int age) {
		super();
		this.model = model;
		this.color = color;
		this.age = age;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void changeModel(String newModel){
		this.model = newModel;
	}
	
	@Override
	public String toString() {
		System.out.println(" ");
		System.out.println("Body_____");
		System.out.println("model - "+model);
		System.out.println("color - "+color);
		System.out.println("age - "+age);
		return super.toString();
	}
	
}
