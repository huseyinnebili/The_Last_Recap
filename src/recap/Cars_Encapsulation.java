package recap;

public class Cars_Encapsulation {

	private String make;
	private String model;
	private int price;
	private int topSpeed;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {

		if (!make.isEmpty()) {

			this.make = make;

		}

		else {

			System.out.println("Please enter any makes.");
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {

		if (!model.isEmpty()) {
			this.model = model;
		}

		else {

			System.out.println("Please enter any models.");
		}

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {

		if (make.equals("Toyota")) {

			switch (price) {

			case 30000:

				model = "Camry";

				break;

			case 35000:

				model = "Corolla";

				break;

			case 45000:

				model = "Sienna";

				break;

			case 50000:

				model = "Highlander";
				
				break;

			default:

				model = "Unknown";

			}
			
			this.price = price;

		} else if (make.equals("Honda")) {

			switch (price) {

			case 30000:

				model = "Civic";

				break;

			case 55000:

				model = "CRV";

				break;

			case 50000:

				model = "Odesse";

				break;

			default:

				model = "Unkown";

				break;

			}

			this.price = price;

		}

		else {

			System.out.println("Unknown price.");
		}
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {

		if (topSpeed > 100) {

			this.topSpeed = topSpeed;

		} else {

			System.out.println("This make and model does not work for me!...");
		}
	}

}
