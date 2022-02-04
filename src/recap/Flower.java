package recap;

public abstract class Flower {

	String type;

	Flower(String type) {

		this.type = type;
	}

	public abstract void bloom();
}

class Tulip extends Flower {

	Tulip(String type) {

		super(type);
	}

	@Override
	public void bloom() {

		System.out.println(type + " blooms in March!..");

	}
}

class Rose extends Flower {

	Rose(String type) {

		super(type);

	}

	@Override
	public void bloom() {

		System.out.println(type + " blooms in June!..");

	}

}

class SunFlower extends Flower {

	SunFlower(String type) {

		super(type);

	}

	@Override
	public void bloom() {

		System.out.println(type + " blooms in August!...");

	}

}