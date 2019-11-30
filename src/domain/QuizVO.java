package domain;

public class QuizVO {
	private String quiz;
	private String answer;
	
	public QuizVO(String q, String a) {
		quiz = q;
		answer = a;
	}

	public String getQuiz() {
		return quiz;
	}

	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
