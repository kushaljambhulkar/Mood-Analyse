package junitGradel;

public class MoodAnalyserRefactor {
	private String message;
	public void MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood() {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}
}
