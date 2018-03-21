package springdemo;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return"workout atleast 10 minutes";
	}

}
