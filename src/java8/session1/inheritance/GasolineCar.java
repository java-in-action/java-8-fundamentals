package java8.session1.inheritance;

import java.time.LocalDate;

public class GasolineCar extends Car {
	public int gallons;
	public float mpg;
	public GasolineCar(long id, String name, int year, String color, LocalDate date, int gallons, float mpg,Engine engine) {
		super(id, name, year, color, date, engine);
		this.gallons = gallons;
		this.mpg = mpg;
	}

	@Override
	public String toString() {
		return "GasolineCar [ name=" + name + ", year=" + year + ", color="
				+ color + ", date=" + date + ", gallons=" + gallons + ", mpg=" + mpg +  "]";
	}
	

}
