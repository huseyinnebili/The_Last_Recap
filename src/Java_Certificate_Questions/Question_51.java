package Java_Certificate_Questions;

interface Question_51 {
	
	
	void export();// an interface can only have public variables and methods so this is a public
					// method.
}

class Tool implements Question_51 {

	protected void export() { // This method should have been public.

		System.out.println("Tool :: export");
	}
}

class ReportTool extends Tool implements Question_51 {

	
	public void export() {

		System.out.println("RTool :: export");
	}

	public static void callExport(Question_51 ex) {

		ex.export();

	}
}
