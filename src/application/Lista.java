package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	
	public static void main(String []args) {
		
		List<Integer> list = new ArrayList<>(); // tem q usar wraper class
		
		list.add(20);
		list.add(15);
		list.add(10);
		list.add(2, 30);
		list.add(25);
		//list.remove(1);
		//list.removeIf(x -> x % 2 == 1); //predicado lambda
		System.out.println("Index of number 10: " + list.indexOf(10) );
		for (Integer x : list ) {
			System.out.println(x);
		}
		List<Integer> result = list.stream().filter(x -> x % 2  != 0 ).collect(Collectors.toList());
		System.out.println("---------------------");
		for (Integer x : result ) {
			System.out.println(x);
		}
		Integer number = list.stream().filter(x -> x % 2  != 0 ).findFirst().orElse(null);
		System.out.println("------------------------");
		System.out.println(number);
	}
}
