package week3.day1;

public class Automation extends MultipleLangauge implements TestTool {

	public static void main(String[] args) {
		Automation Auto = new Automation();
		Auto.Java();
		Auto.Selenium();
		Auto.python();
		Auto.ruby();

	}

	public void Java() {
		System.out.println("Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}


}
