import java.util.Arrays;

public class Question {
	private String text;
	private String[] answers;
	private int correctAnswer = 0;

	public Question(String questionText, String[] answers, int correctAnswer) {
		this.text = questionText;
		this.answers = answers.clone();
		this.correctAnswer = correctAnswer;
	}


	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getAnswers() {
		return this.answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers.clone();
	}

	public int getCorrectAnswer() {
		return this.correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	

	@Override
	public String toString() {
		return "{" +
			" text='" + getText() + "'" +
			", answers='" + Arrays.toString(getAnswers()) + "'" +
			", correctAnswer='" + getCorrectAnswer() + "'" +
			"}";
	}

}
