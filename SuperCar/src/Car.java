
public class Car {

	private int prise;
	private int maxSpeed;
	private String typeOfFuel;
	
	Body body = new Body("z250", "red", 8);
	Wheel wheel = new Wheel(21, 5, "winter");
	Helm helm = new Helm(18, "leather");
	
	public Car(int prise, int maxSpeed, String typeOfFuel, Body body, Wheel wheel, Helm helm) {
		super();
		this.prise = prise;
		this.maxSpeed = maxSpeed;
		this.typeOfFuel = typeOfFuel;
		this.body = body;
		this.wheel = wheel;
		this.helm = helm;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String isTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Car(int prise, int maxSpeed, String typeOfFuel) {
		super();
		this.prise = prise;
		this.maxSpeed = maxSpeed;
		this.typeOfFuel = typeOfFuel;
	}
	
	
	public void newParameters(int newPrise , int newMaxSpeed){
		this.prise = newPrise;
		this.maxSpeed = newMaxSpeed;
		
	}
	
	@Override
	public String toString() {
		System.out.println(" ");
		System.out.println("Car_____");
		System.out.println("Prise - "+prise);
		System.out.println("maxSpeed - "+maxSpeed);
		System.out.println("typeOfFuel - "+typeOfFuel);
		return super.toString();
	}
	
	
	
	
	
}
