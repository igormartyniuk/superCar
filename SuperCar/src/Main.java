
public class Main {

	public static void main(String[] args) {

		Body body = new Body("z250", "red", 10);
		Wheel wheel = new Wheel(21, 5, "winter");
		Helm helm = new Helm(18, "leather");
		
		Car car = new Car(150000, 220, "benzine", body, wheel, helm);
		
		wheel.changeSeason("summer");
		body.changeModel("z330");
		wheel.reSizingDiametr(-5);
		
		System.out.println (car);
		System.out.println (body);
		System.out.println (wheel);
		System.out.println (helm);
	}

}
