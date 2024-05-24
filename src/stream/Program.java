package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> streamDaList = list.stream().map(x->x*10);
		
		System.out.println(Arrays.toString(streamDaList.toArray()));
		
		Stream<Integer> streamInt = Stream.of(1,2,3,4).map(x->x*25);
		System.out.println(Arrays.toString(streamInt.toArray()));
		
		Stream<String> streamString = Stream.of("Maria", "José", "Miguel").map(x->x+" abc");
		System.out.println(Arrays.toString(streamString.limit(2).toArray()));
		
		

		sc.close();
	}

}
