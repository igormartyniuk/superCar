
public class Helm {

	private int radius;
	private String coating;
	
	public Helm(int radius, String coating) {
		super();
		this.radius = radius;
		this.coating = coating;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getCoating() {
		return coating;
	}

	public void setCoating(String coating) {
		this.coating = coating;
	}
	
	@Override
	public String toString() {
		System.out.println(" ");
		System.out.println("Helm_____");
		System.out.println("radius - "+radius);
		System.out.println("coating - "+coating);
		return super.toString();
	}
}
