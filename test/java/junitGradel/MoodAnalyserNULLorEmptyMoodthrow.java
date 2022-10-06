package junitGradel;

public class MoodAnalyserException {
	private String message;
	public void MoodAnalyser(String message) throws MoodAnalysisException {
		this.message = message;
	}
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException exception) {
			throw new MoodAnalysisException("Please provide a valid input");
		}
	}
}
