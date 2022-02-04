package Java_Certificate_Questions;

 interface Question_63 {

	void export();

}

class Tooll implements Question_63 {

	@Override
	public void export() {

		System.out.println("Tool ::export");

	}

}

class ReportTooll extends Tooll {

	void export() {

		System.out.println("RTool ::export");

	}

	public static void callExport(Question_63 ex) {

		ex.export();
	}
}
