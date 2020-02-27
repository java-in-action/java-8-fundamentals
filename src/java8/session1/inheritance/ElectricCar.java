package java8.session1.inheritance;

import java.time.LocalDate;

public class ElectricCar extends Car {
	public int batteries;
	public int power;
	public ElectricCar(long id, String name, int year, String color, LocalDate date,int batteries,int power,Engine engine) {
		super(id, name, year, color, date, engine);
		this.batteries=batteries;
		this.power=power;
	}
	
	// se sobreescribe el metodo toString
	@Override
	public String toString() {
		return "ElectricCar [name=" + name + ", year=" + year
				+ ", color=" + color + ", date=" + date + ", batteries=" + batteries + ", power=" + power +  "]";
	}
	
	
	
}
