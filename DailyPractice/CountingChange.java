import java.util.Scanner;

class CountingChange extends DailyPractice {
	CountingChange() {
		name = "Counting Change";
	}

	public void run() {
		Scanner input = new Scanner(System.in);

		System.out.println("How many pennies?");
		int pennies = input.nextInt();

		System.out.println("How many nickels?");
		int nickels = input.nextInt();
		
		System.out.println("How many dimes?");
		int dimes = input.nextInt();

		System.out.println("How many quarters?");
		int quarters = input.nextInt();

		int cents = pennies + nickels * 5 + dimes * 10 + quarters * 25;
		
		System.out.println("Your total is: $" + (cents / 100.0));
	}
}