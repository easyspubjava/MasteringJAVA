package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
		sList.stream().filter(s->s.length() >= 6).forEach(s->System.out.println(s));
				
				
	}

}
