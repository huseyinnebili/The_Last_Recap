package recap;

public class Demo_ScrumTeam {

	public static void main(String[] args) {


		ScrumTeam st=new ScrumTeam("","","");
		
		st.artifacts= "Product Backlog,Sprint Backlog,Burn-down Chart,Burn-up Chart";
		st.ceremonies="Sprint Planning Meeting ,Sprint Daily Stand-up,and Sprint Retro";
		st.team_members="Product Owner,Scrum Master,Development Team ,and QA Team ";
		st.display_ScrumTeam();
		
		
		
		
		ProductOwner po=new ProductOwner("","","","");
		
		po.artifacts="Product Backlog";
		po.ceremonies="Sprint Planning Meeting, and Sprint Retro";
		po.user_stories="User Stories,and Epics";
		po.team_members="Scrum Team";
		po.display_ProductOwner();
		

		ScrumMaster sm=new ScrumMaster("","","","");
		
		sm.artifacts="Burn-down Chart,Burn-up Chart";
		sm.ceremonies="Sprint Planning Meeting ,Sprint Daily Stand-up,and Sprint Retro";
		sm.manage="managing the team and handling their needs";
		sm.team_members="Scrum Team";
		sm.display_ScrumMaster();
		
		
		DevelopmentTeam dt=new DevelopmentTeam("","","","");
		
		dt.artifacts="Sprint Backlog";
		dt.ceremonies="Sprint Planning Meeting ,Sprint Daily Stand-up,and Sprint Retro";
		dt.coding="creating actual codes,building them and doing minimal testing";
		dt.team_members="Scrum Team";
		dt.display_DevelopmentTeam();
		
        
		QATeam qa=new QATeam("","","","");
		
		qa.artifacts="Sprint Backlog";
		qa.ceremonies="Sprint Planning Meeting ,Sprint Daily Stand-up,and Sprint Retro";
		qa.testing="creating test case and executing manual testing, then creating automation test scripts,and executing them";
		qa.team_members="Scrum Team";
		qa.display_QATeam();
	}

}
