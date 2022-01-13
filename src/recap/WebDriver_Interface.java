package recap;

public interface WebDriver_Interface {

	void open();

	void close();

	String getTitle();

}

interface TakeScreenshot {

	void getScreenshot();

}

interface RemoteWebDriver extends WebDriver_Interface, TakeScreenshot {

	void navigate();
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {

		System.out.println("I navigated through Chrome driver!..");

	}

	@Override
	public void close() {

		System.out.println("I closed the webpage opened in Chrome driver!..");
	}

	@Override
	public String getTitle() {

		return "Chrome Driver";
	}

	@Override
	public void getScreenshot() {

		System.out.println("I took a screenshot in Chrome driver!..");
	}

	@Override
	public void navigate() {

		System.out.println("I navigated to the browser through Chrome driver!...");
	}

}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {

		System.out.println("I navigated through Firefox driver!..");

	}

	@Override
	public void close() {

		System.out.println("I closed the webpage opened in Firefox driver!..");
	}

	@Override
	public String getTitle() {

		return "Firefox Driver";
	}

	@Override
	public void getScreenshot() {

		System.out.println("I took a screenshot in Firefox driver!..");
	}

	@Override
	public void navigate() {

		System.out.println("I navigated to the browser through Firefox driver!...");
	}

}

class Demo_WebDriver_Interface{
	
	public static void main(String[] args) {
		
	//	WebDriver_Interface obj=new WebDriver_Interface();  //An Interface can not be instantiate.
		
		ChromeDriver chrm=new ChromeDriver();
		
		chrm.open();
		
		
		FirefoxDriver fire=new FirefoxDriver();
		
		fire.open();
		
		
		//Upcasting
		
		
		WebDriver_Interface obj=new ChromeDriver();
		obj.close();
		
		WebDriver_Interface obj_2=new FirefoxDriver();
		obj_2.close();
		
		
	}
}