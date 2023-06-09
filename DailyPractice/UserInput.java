import java.util.Scanner;

class UserInput extends DailyPractice {
	UserInput() {
		name = "Getting User Input";
	}
	
	public void run() {
		Scanner input = new Scanner(System.in);

		System.out.println("What's your favorite letter?");
		char favoriteLetter = input.nextLine().charAt(0);

		System.out.println("How old are you in years?");
		int age = input.nextInt();

		System.out.println("How much money do you have on hand?");
		double money = input.nextDouble();

		System.out.println("True/False: Do you like pineapple pizza?");
		boolean pizzaPreference = input.nextBoolean();

		input.nextLine();
		
		System.out.println("What is your favorite food?");
		String favoriteFood = input.nextLine();

		System.out.println("You are " + age + " years old. Your favorite letter is " + favoriteLetter + ". Your favorite food is " + favoriteFood + ". You " + (pizzaPreference ? "" : "do not ") + "like pineapple pizza. You have $" + money + " on hand.");

		input.close();
	}
}