package recap;

public class Country {

	public String capitol;
	protected double population;
	double GDP;
	protected double per_Capita;
	public String country;
	boolean isDemocracy;

	public Country() {

		System.out.println("We will give about the countries and their per capitas.");
	}

	public Country(String country, String capitol) {

		this();
		this.country = country;
		this.capitol = capitol;

	}

	public Country(String country, String capitol, boolean isDemocracy) {

		this(country, capitol);
		this.isDemocracy = isDemocracy;

	}

	public void calculate_per_Capita() {

		per_Capita = GDP / population;

	}

	protected void display_Country() {

		System.out.println("We can calculate per capita of a country by dividing GDP by population.");
	}
}

class Child_Country extends Country {

	String continent;

	public Child_Country(String country, String capitol) {

		super(country, capitol);
	}

	public Child_Country(String country, String capitol, boolean isDemocracy, String continent) {

		super(country, capitol, isDemocracy);

		this.continent = continent;
	}

	public void calculate_of_per_Capita_Country() {

		super.calculate_per_Capita();

		System.out.println("The per Capita of " + country + " = $" + per_Capita + ".");
	}

	public void display_of_country() {

		System.out.println("The capitol of the " + country + " is " + capitol + ".");

		System.out.println("Is " + country + " a democratic country?(true/false) " + isDemocracy);

		System.out.println(country + " is in " + continent + " continent.");
	}
}
