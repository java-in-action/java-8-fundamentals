package java8.session6.generics2;

import java.util.TreeSet;

/*
 * Topics: Collections.toArray, foreach and TreeSet
 * Referemces:
 * 
 * https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html#toArray--
 * https://www.tutorialspoint.com/java/util/arraylist_toarray.htm
 * https://www.tutorialspoint.com/java/java_treeset_class.htm
 * https://www.quora.com/How-does-the-set-method-in-JAVA-allow-for-duplicates
 * https://www.geeksforgeeks.org/lambda-expressions-java-8/
 */
public class TestToArray {
	public static void main(String[] args) {
		Computer c1 = new Computer(2015, "white");
		Computer c2 = new Computer(2009, "black");
		Computer c3 = new Computer(2014, "black");
		
		TreeSet<Computer> computers = new TreeSet<Computer>();
		computers.add(c1);
		computers.add(c2);
		computers.add(c3);
		
		// Returns an array containing all of the elements in this collection.
		Object[] s1 = computers.toArray();
		
		
		// Output?
		for (Object s: s1) {
			System.out.println("Computer: " + s);
		}
		
	}
}
