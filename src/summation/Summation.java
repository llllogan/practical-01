package summation;

/* 
 * The program is meant to sum the natural numbers in a
 * fixed range 
 */

public class Summation {

	/* Constants defining the inclusive bounds of the range to be summed */
	private static final long START = 1;
	private static final long END = 1000; // First try 5, then 1000;

	/* Variable to hold the sum of numbers from START to END, inclusive */
	private long total;

	/* Constructor to initialize instance variable */
	public Summation() {
		total = 0;
	}

	/* Method to calculate the sum */
	public void add() {
		for (long index = START; index <= END; index++) {
			total += index;
		}
	}

	/* Method to print the result to the screen */
	public void displayResult() {
		System.out.printf("The sum of the integers from %d to %d is %d.%n",
				START, END, total);
	}

	/* Main program */
	public static void main(String[] args) {
		Summation sum = new Summation();
		sum.add();
		sum.displayResult();
	}
}


