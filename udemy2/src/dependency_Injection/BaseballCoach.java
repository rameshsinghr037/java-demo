package dependency_Injection;

public class BaseballCoach implements Coach {
	// define a private field for dependencies
	private FortuneService fortuneService;

	// define a constructor for the dependency injection
	public BaseballCoach(FortuneService thefortuneService) {

		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "workout atleast 10 minutes";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

}
