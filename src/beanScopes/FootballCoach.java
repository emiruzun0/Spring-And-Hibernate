package beanScopes;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public FootballCoach() {
	}

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "You should give better passes";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It : " + fortuneService.getFortune();
	}

}
