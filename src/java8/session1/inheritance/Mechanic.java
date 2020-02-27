package java8.session1.inheritance;

public class Mechanic {
	public String name;
	public Car car;
	
	public Mechanic(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	public void assignCar(Car car) {
		System.out.println("Carro asignado Mechanic "+name+" : "+car);
	}
}
