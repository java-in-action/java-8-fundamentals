package java8.session6.generics2;

import java.util.HashMap;
import java.util.Map;

/*
 * Topics: HashMap, lambda and For Each
 * 
 * https://www.geeksforgeeks.org/java-util-hashmap-in-java/
 * https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 */
public class TestForEach {
	public static void main(String[] args) {
		Map<Integer, String> namesMap = new HashMap<>();
		Computer c1 = new Computer(2009, "white");
		Computer c2 = new Computer(2009, "black");
		Computer c3 = new Computer(2014, "black");
		
		namesMap.put(c1.getId(), c1.getDesc());
		namesMap.put(c2.getId(), c2.getDesc());
		namesMap.put(c3.getId(), c3.getDesc());
		
		//  lambda operator -> body
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		
	}
}
