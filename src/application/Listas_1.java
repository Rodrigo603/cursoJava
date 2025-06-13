package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(8);
		list.add(10);
		list.add(2, 15);
		for (Integer x : list) {         //for each
			System.out.println(x);
		}
		System.out.println("------------------------");
		list.add(2, 15);
		System.out.println(list.size());
		list.removeIf(x -> x % 2 == 0);
		for (Integer x : list) {         
			System.out.println(x);
		}
		System.out.println("index of 9: " + list.indexOf(9));
		List<Integer> result = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList()); //lambda
		for (Integer x : result) {         
			System.out.println(x);
	}
		System.out.println("------------------------");
		Integer number = list.stream().filter(x -> x % 2 != 0).findFirst().orElse(null);
		System.out.println(number);
 }
}
