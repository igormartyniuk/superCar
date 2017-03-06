
public class Wheel {

	private int diametr;
	private int width;
	private String season;

	public Wheel(int diametr, int width, String season) {
		super();
		this.diametr = diametr;
		this.width = width;
		this.season = season;
	}
	
	public Wheel(int diametr) {
		super();
		this.diametr = diametr;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	public void reSizingDiametr(int size){
		this.diametr = diametr+size;
		
	}
	
	public void changeSeason(String changeSeacon){
		this.season = changeSeacon;
		
	}
	
	@Override
	public String toString() {
		System.out.println(" ");
		System.out.println("Wheel_____");
		System.out.println("diametr - "+diametr);
		System.out.println("width - "+width);
		System.out.println("season - "+season);
		return super.toString();
	}
}
