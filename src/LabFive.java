import java.util.Scanner;

public class LabFive {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		String answer;

		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n):");
		answer = input.nextLine();

		String cont;

		do {
		

			System.out.println("Enter the Number of sides for the dice:");
			int capture = input.nextInt();

			double x = Math.random() * capture;
			long result = (long) x;

			double y = Math.random() * capture;
			long result2 = (long) y;

			System.out.println(result);
			System.out.println(result2);

			System.out.println("Roll again? (y/n): ");
			cont = input.nextLine();
			cont = input.nextLine();

		} while (cont.equals("y"));
//closing the scanner
		input.close();

	}// psvm

}// class
//TODO Auto-generated method stub
// download scanner method
// make a new scanner
// sysout - ask user to enter number of sides of a pair of dice.
// capture temporary user data and put into new data type + variable name (i.e.
// String name)
