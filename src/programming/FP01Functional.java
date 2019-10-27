package programming;
import java.util.List;

import static java.lang.System.out;

public class FP01Functional {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 12 ,15);
		//List.of introduced on Java 9
		printAllNumbersInListFunctional(numbers);
		out.println("Numbers Even");
		printEvenNumbersInListFunctional(numbers);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.forEach(System.out::println); //Method reference
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.stream()
					//.filter(FP01Functional::isEven) //Filter - Only Allow Even Numbers
					.filter(number -> number % 2 == 0) //Lambda expression - a simple away of defining another method
					.forEach(System.out::println); //Method reference
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
