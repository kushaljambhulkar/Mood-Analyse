package Basic.Practice;

public class MoodAnalyse {

	String Message;
//	Constructor
	MoodAnalyse(String Message){
		this.Message=Message;
	}
//	Method Calling
	public String moodAnalyserr(){
		if(Message.contains("Happy :)")) {
			return "Happy :)";
		}else if(Message.contains("Sad :(")){
			return "Sad :(";
		}else if(Message.contains("Other :|")) {
			return "Happy";
		}else {
			return null;
		}
	}
}
