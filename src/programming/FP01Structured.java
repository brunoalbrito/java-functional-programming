package programming;
import java.util.List;

public class FP01Structured {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 12 ,15);
		
		//List.of introduced on Java 9
		printAllNumbersInListStructed(numbers);
		
		printEvenNumbersInListStructed(numbers);
	}

	private static void printAllNumbersInListStructed(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructed(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number:numbers) {
			if(number % 2 == 0)
				System.out.println(number);
		}
	}
}
