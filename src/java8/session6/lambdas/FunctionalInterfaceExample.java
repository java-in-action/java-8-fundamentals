package java8.session6.lambdas;

/*
 * Topics: Lambdas, Functional interfaces
 * https://stackoverflow.com/questions/33492203/what-are-the-advantages-of-using-lambda-expressions-in-java-8
 * https://www.baeldung.com/java-8-functional-interfaces
 * https://www.geeksforgeeks.org/lambda-expressions-java-8/
 */
public class FunctionalInterfaceExample {

	public FunctionalInterfaceExample() {
	}

	public static void main(String[] args) {
		// Traditional way
		FunctionalInterfaceClass fiec = new FunctionalInterfaceClass();
		fiec.fly();
		
		// Lambda - Java 8
		Flying f = () -> { System.out.println("Eagle"); };
		f.fly();
		
	}

}

