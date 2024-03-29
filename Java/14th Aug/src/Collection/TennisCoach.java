package Collection;

public class TennisCoach {
	private String name;
	private Level level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public TennisCoach() {
		super();
	}

	public String CoachDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name of coach " + getName());
		sb.append(" plan of today workout is " + getDailyWorkout());
		sb.append(" level of coachh is " + getLevel());
		return sb.toString();
	}

	public String getDailyWorkout() {
		return "practice back volleyball today";

	}

	public void createCoach(String name, Level level) {
		this.setName(name);
		this.setLevel(level);
	}
}