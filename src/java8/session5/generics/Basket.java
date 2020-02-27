package java8.session5.generics;

import java.util.ArrayList;
import java.util.Collections;

public class Basket implements Printable {
	ArrayList<Fruit> list = new ArrayList<Fruit>();
	
	public void add(Fruit fruit) {
		list.add(fruit);
	}
	
	@Override
	public void print() {
		if ( list.isEmpty() ) {
			System.out.println("The basket is empty");			
		} else {
			System.out.println("The basket contains: ");
			Collections.sort(list);
			for(Fruit fruit: list) {
				System.out.println( fruit.getName() );
			}
		}
	}
}
