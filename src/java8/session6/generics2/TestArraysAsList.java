package java8.session6.generics2;


import java.util.Arrays;

/*
 * Topics: Arrays.asList, forEach, :: operator (method passed as reference), lambdas
 * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-
 * https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx
 * https://www.geeksforgeeks.org/lambda-expressions-java-8/
 */
public class TestArraysAsList {

	public static void main(String[] args) {
		Computer c1 = new Computer(2015, "white");
		Computer c2 = new Computer(2009, "black");
		Computer c3 = new Computer(2014, "black");
		
		Arrays.asList(c1, c2, c3).forEach( n -> System.out.println(n) );
		
		Arrays.asList(c1, c2, c3).forEach(System.out::println);
		
	}
	
	public static void fun(int ... a) 
	{
		
	} 

	public static void fun2(int[] a) 
	{
		
	} 

}
