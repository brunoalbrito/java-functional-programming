package programming;
import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {
		
		//List.of introduced on Java 9
		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 12 ,15));
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.forEach(FP01Functional::print); //Method reference
	}
	
	public static void print(int number) {
		System.out.println(number);
	}
}
