package recap;

public class Demo_Seasons {

	public static void main(String[] args) {


		Seasons seasn=new Seasons();
		
		
		Seasons season=new Seasons("winter,spring,summer and autumn",4);
		season.display_seasons();
		Seasons.common_fetures_of_seasons(4, "winter,spring,summer and autumn");
		
		
		
		Winter winter=new Winter("Winter",4,"snowy");
		winter.event="not sunny";
		winter.display_winter();
		
		
		Spring spring =new Spring ("Spring",4,20);
		spring.temp_median=21;
		spring.display_spring();
		
		Summer summer=new Summer("Summer",4,"swimming,tracking,biking etc.");
		summer.display_summer();
		
		Autumn autumn=new Autumn("Autumn",4,"Thanksgiving,Hallowen");
		autumn.festival="Hallowen";
		autumn.display_autumn();
		
	}

}
