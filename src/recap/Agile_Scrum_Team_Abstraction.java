package recap;

public abstract class Agile_Scrum_Team_Abstraction {

	public void attend_Meeting() {

		System.out.println("Every stakeholder should attend to some meetings in Agile Scrum Methodoligies.");
	}

	public void main_Responsibility() {

		System.out.println("Everyone in an Agile Team has different responsibility. ");
	}

	public abstract void getDescription();

	public abstract void getSalaryRange();

}

class Product_OWner extends Agile_Scrum_Team_Abstraction {

	@Override
	public void getDescription() {

		System.out.println(
				"The Product Owner is a main role in Agile Scrum Methodology who is responsible for creating user stories and epics from client perspective and put them into product backlog as an excell sheet.");
	}

	@Override
	public void getSalaryRange() {

		System.out.println("Product Owner's salary is between $ 90000 and $150000.");
	}

	@Override

	public void main_Responsibility() {

		System.out.println(
				"A Product Owner's main responsibility is providing worthy connection between Scrum Team and customers and converting business issues to technical solutions.");
	}
}

class Scrum_Master extends Agile_Scrum_Team_Abstraction {

	@Override
	public void getDescription() {

		System.out.println("Scrum Master is a person managing Scrum Team and hangling their all needs.");

	}

	@Override
	public void getSalaryRange() {

		System.out.println("Scrum Master's salary is between $ 80000 and $140000.");

	}

	@Override

	public void attend_Meeting() {

		System.out.println(
				"Scrum Master should attend to all meetings such as Sprint Planning,Sprint Retro,Dailiy  Standup etc.");
	}

}
