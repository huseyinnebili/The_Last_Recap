package recap;

public class ScrumTeam {

	public    String artifacts;
	protected String ceremonies;
	          String team_members;

	private ScrumTeam(String ceremonies, String artifacts) {

		this.ceremonies = ceremonies;
		this.artifacts = artifacts;

	}

	public ScrumTeam(String ceremonies, String artifacts, String team_members) {

		this(ceremonies, artifacts);
		this.team_members = team_members;

	}

	public void display_ScrumTeam() {

		System.out.println("A Scrum Team is  responsible for attending the " + ceremonies
				+ " and also responsible for collaberating togather to build the " + artifacts + ".");

		System.out.println("A Scrum Team consists of a " + team_members + ".");
	}

}

class ProductOwner extends ScrumTeam {

	String user_stories;

	public ProductOwner(String ceremonies, String artifacts, String team_members, String user_stories) {

		super(ceremonies, artifacts, team_members);

		this.user_stories = user_stories;

	}

	    void display_ProductOwner() {

		System.out.println("A Product Owner is a part of " + team_members
				+ ",and he/she is responsible for attending the " + ceremonies
				+ " and also collaberating togather to build the " + artifacts + "," + user_stories + ".");
	}
}

class ScrumMaster extends ScrumTeam {

	String manage;

	protected ScrumMaster(String ceremonies, String artifacts, String team_members, String manage) {

		super(ceremonies, artifacts, team_members);

		this.manage = manage;

	}

	protected void display_ScrumMaster() {

		System.out
				.println("A Scrum Master is a part of " + team_members + ",and he/she is responsible for attending the "
						+ ceremonies + " and also responsible for creating the " + artifacts + ",and " + manage + ".");
	}
}

class DevelopmentTeam extends ScrumTeam {

	String coding;

	DevelopmentTeam(String ceremonies, String artifacts, String team_members, String coding) {

		super(ceremonies, artifacts, team_members);

		this.coding = coding;

	}

	public void display_DevelopmentTeam() {

		System.out.println(
				"A Development Team is a part of " + team_members + " ,and the team is responsible for attending the "
						+ ceremonies + " and also responsible for building the " + artifacts + ",and " + coding + ".");
	}

}

class QATeam extends ScrumTeam {

	String testing;

	public QATeam(String ceremonies, String artifacts, String team_members, String testing) {

		super(ceremonies, artifacts, team_members);

		this.testing = testing;
	}

	public void display_QATeam() {

		System.out.println("A QA Team is a part of " + team_members + ",and the team is responsible for attending the "
				+ ceremonies + " and also responsible for building the " + artifacts + ",and " + testing + ".");
	}
}