package Java_Certificate_Questions;

public class Demo_Question_51 {

	public static void main(String[] args) {

		Tool aTool = new ReportTool(); //up-casting
		Tool bTool = new Tool();
		
		ReportTool.callExport(aTool);
		ReportTool.callExport(bTool);

		//aTool.export();
		//bTool.export();
	}
}
