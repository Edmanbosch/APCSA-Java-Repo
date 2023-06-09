import java.util.Scanner;

public class MagicEightBall extends DailyPractice {
	MagicEightBall() {
		name = "Magic Eight Ball";
	}
	String[] messages = {
		"It is certain.",
		"It is decidedly so.",
		"Without a doubt.",
		"Yes definitely.",
		"You may rely on it.",
		"As I see it, yes.",
		"Most likely.",
		"Outlook good.",
		"Yes.",
		"Signs point to yes.",
		"Reply hazy, try again.",
		"Ask again later.",
		"Better not tell you now.",
		"Cannot predict now.",
		"Concentrate and ask again.",
		"Don't count on it.",
		"My reply is no.",
		"My sources say no.",
		"Outlook not so good.",
		"Very doubtful"
	};

	public void run() {
		
		System.out.println("Welcome to the Magic Eight Ball!\n\nAsk me a question, or type \"close\" to exit the program");
		System.out.println("> ");
		
		Scanner input = new Scanner(System.in);
		while (true) {
			String userResponse = input.nextLine();
			
			if (userResponse.equals("close")) {
				System.exit(0);
			}

			System.out.println(messages[(int) Math.floor(Math.random() * 20)]);
			
			System.out.println("Ask me another question");
			System.out.println("> ");
			
			
		}

		
		// you will need to use Math.random() to generate random number
		
		// Responses below
		
		// It is certain.
		// It is decidedly so.
		// Without a doubt.
		// Yes definitely.
		// You may rely on it.
		
		// As I see it, yes.
		// Most likely.
		// Outlook good.
		// Yes.
		// Signs point to yes.
		
		// Reply hazy, try again.
		// Ask again later.
		// Better not tell you now.
		// Cannot predict now.
		// Concentrate and ask again.
		
		// Don't count on it.
		// My reply is no.
		// My sources say no.
		// Outlook not so good.
		// Very doubtful
	 }

}

