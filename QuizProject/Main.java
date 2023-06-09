public class Main {
	public static void main(String[] args) {
		Quiz csQuiz = new Quiz("CS Quiz #1");
		
		csQuiz.addQuestion(new Question(
			"Which of these types is used to hold multiple values of the same type", 
			new String[] { "array", "boolean", "double", "int"}, 
			0)
		);

		csQuiz.addQuestion(new Question(
			"What of the following is the name of Java's dynamic array class?",
			new String[] { "Array", "ArrayList", "List", "Vector"}, 
			1)
		);

		csQuiz.addQuestion(new Question(
			"What is the name of the special function that runs upon instantiation of a class?", 
			new String[] { "Method", "Constructor", "Initializer", "Function"}, 
			1)
		);

		csQuiz.addQuestion(new Question(
			"Which of these primitive types can hold decimal values?", 
			new String[] { "int", "boolean", "double", "char"}, 
			2)
		);

		csQuiz.addQuestion(new Question(
			"Which keyword is used to declare that a function does not return any value?", 
			new String[] { "null", "void", "private", "static"}, 
			1)
		);

		csQuiz.start();
	}
}
