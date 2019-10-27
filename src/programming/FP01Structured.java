package programming;
import java.util.List;

public class FP01Structured {
	public static void main(String[] args) {
		
		//List.of introduced on Java 9
		printAllNumbersInListStructed(List.of(12, 9, 13, 4, 6, 2, 12 ,15));
	}

	private static void printAllNumbersInListStructed(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number);
		}
	}
}
