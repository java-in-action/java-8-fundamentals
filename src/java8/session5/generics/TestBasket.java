package java8.session5.generics;

public class TestBasket {
	public static void main(String args[]) {
		Basket basket = new Basket();
		Apple apple = new Apple();
		Orange orange = new Orange();
		Pear pear = new Pear();
		Onion onion = new Onion();
		
		basket.add(apple);
		basket.add(pear);
		basket.add(orange);
		
		
		// try to add a vegetable in a fruit basket
		
		basket.print();
		
	}
}
