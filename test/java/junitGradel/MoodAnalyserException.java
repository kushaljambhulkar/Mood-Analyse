package junitGradel;

public class MoodAnalyserException {
	private String message;
	public void MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood() {
		try {
			if (message.contains("Sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException exception) {
			return "HAPPY";
		}
	}
}