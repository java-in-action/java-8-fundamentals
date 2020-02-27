package java8.session1.inheritance;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/* Open the image file img/Java8-Session1-Class Diagram.jpg and create 
 * the objects and interfaces required.
 * 
 * 1.- Create a constructor in Car that receives all the arguments to initialize them  
 * 2.- Create toString Method to display all the attributes
 * 3.- Create an instance of car and use the constructor in number 1 to initialize the attributes
 * 4.- Call the toString method and run the class to see the output 
 * 
 * Note: Fix the issues if there is any 
 * 
 */
public class TestCar {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(2018, Month.APRIL, 16);
		Model model=new Model(1,"SD10");
		
		Engine engine=new Engine("MT-electrico");
		Car c=new ElectricCar(2,"Nissan",2010,"negro",date,1,100,engine);
		Mechanic mechanic=new Mechanic("Angel",c);
		c.speedUp(100);
		c.speedDown(5);
		System.out.print(c.toString()+"\n");
		c.addModel(model);		
		System.out.println("Motor: "+engine.getType());
        mechanic.assignCar(c);
		System.out.println("\n-----------------------------------------------\n");
		
		LocalDate date2=LocalDate.of(2018, Month.JULY, 25);
		Model model2=new Model(1,"FG20");
		Engine engine2=new Engine("MT-Gasolina");
		Car c2=new GasolineCar(200, "BMW",2012 , "blanco", date2, 20, 100,engine);
		Mechanic mechanic2=new Mechanic("Jose",c);
		
		System.out.println("Precio: "+c2.calculatePrice());
		System.out.println("Costo: "+c2.calculateCost());
		System.out.print(c2.toString());
		c.addModel(model2);//agregando modelo
		System.out.println("Motor: "+engine2.getType());
		mechanic2.assignCar(c2);
		

	}

}
