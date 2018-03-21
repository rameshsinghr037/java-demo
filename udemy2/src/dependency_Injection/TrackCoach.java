package dependency_Injection;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "run hard a 2km\n";
	}

	@Override
	public String getFortuneService() {
		return "just do it......!" + fortuneService.getFortune();
	}

}
