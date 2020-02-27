package java8.session1.inheritance;

import java.time.LocalDate;

public class Car implements Vehicle,FinancialCalculations  {
	private long id;
	public String  name;
	public int year;
	public String color;
	public LocalDate date;
	private Engine engine;
    
   public Car(long id, String name, int year, String color, LocalDate date,Engine engine) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.color = color;
		this.date = date;
		this.engine= engine;
	}
 
   public void addModel(Model model) {
		System.out.println(model);
		
	}
	@Override
	public void speedUp(int power) {
		System.out.println("Acelerar : "+power);
		
	}

	@Override
	public void speedDown(int batteries) {
		System.out.println("Reducir velocidad: bateria baja "+batteries +"%");
		
	}

	@Override
	public double calculatePrice() {
		return PRICE;
	}

	@Override
	public double calculateCost() {
		return COST;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", year=" + year + ", color=" + color + ", date=" + date +","
				+"]";
	}


}
