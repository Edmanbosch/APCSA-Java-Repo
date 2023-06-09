import java.util.ArrayList;

public class Quiz {
	private String quizName;

	private ArrayList<Question> questions = new ArrayList<Question>();


	public Quiz(String quizName) {
		this.quizName = quizName;
	}

	public void start() {
		int numCorrect = 0;

		int i = 0;
		while (i < questions.size()) {
			Question q = questions.get(i);
			System.out.println((i+ 1) + ". " + q.getText());

			String[] answers = q.getAnswers();
			char answer = InputHelper.getChar("a. " + answers[0] + "\nb. " + answers[1] + "\nc. " + answers[2] + "\nd. " + answers[3]);
			int answerIndex = -1;
			switch (answer)
			{
				case 'A':
				{
					answerIndex = 0;
				}
				break;

				case 'B':
				{
					answerIndex = 1;
				}
				break;

				case 'C':
				{
					answerIndex = 2;
				}
				break;

				case 'D':
				{
					answerIndex = 3;
				}
				break;
			}

			if (q.getCorrectAnswer() == answerIndex)
			{
				numCorrect++;
			}

			i++;
		}

		System.out.println("You got " + numCorrect + " out of " + questions.size() + " questions correct!");
	}

	public void addQuestion(Question q) {
		questions.add(q);
	}

	public String getQuizName() {
		return this.quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public int getNumberOfQuestions() {
		return questions.size() + 1;
	}

	public void displayQuestions() {
		for (Question q: questions) {
			System.out.println(q);
		}
	}

	@Override
	public String toString() {
		return quizName;
	}
}
