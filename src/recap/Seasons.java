package recap;

public class Seasons {

	protected String name;
	public int num_of_month;

	public Seasons() {

		System.out.println("We will explain the seasons.");
	}

	Seasons(String name, int num_of_month) {

		this.name = name;
		this.num_of_month = num_of_month;

	}

	public void display_seasons() {

		System.out.println(
				"We have four seasons called " + name + ", and each of them takes " + num_of_month + " months.");
	}

	public static void common_fetures_of_seasons(int num_of_month, String name_of_seasons) {

		System.out.println("All seasons generally take " + num_of_month + " months and we can live all seasons called "
				+ name_of_seasons + " in northern hemisphere");
	}
}

class Winter extends Seasons {

	 String event;

	protected Winter(String name, int num_of_month, String event) {

		super(name, num_of_month);

		this.event = event;
	}

	public void display_winter() {

		System.out.println(name + " is  the first season.It takes " + num_of_month + " months, and days are generally "
				+ event + ".");
	}
}

class Spring extends Seasons {

	protected int temp_median;

	public Spring(String name, int num_of_month, int temp_median) {

		super(name, num_of_month);
		this.temp_median = temp_median;

	}

	public void display_spring() {

		System.out.println(name + " is the second season.It generally takes " + num_of_month
				+ " months ,and it's median temperature is " + temp_median + ".");
	}

}

class Summer extends Seasons {

	String activity;

	protected Summer(String name, int num_of_month, String activity) {

		super(name, num_of_month);

		this.activity = activity;
	}

	protected void display_summer() {

		System.out.println(name + " is the third season.It generally takes " + num_of_month
				+ " months ,and the most popular activities are " + activity + ".");
	}
}

class Autumn extends Seasons {

	protected String festival;

	Autumn(String name, int num_of_month, String festival) {

		super(name, num_of_month);

		this.festival = festival;
	}

	public void display_autumn() {

		System.out.println(name + " is the last season.It generally takes " + num_of_month
				+ " months , and it contains some festivals such as " + festival + ".");
	}
}
