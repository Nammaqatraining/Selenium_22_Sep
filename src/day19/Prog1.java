package day19;

import java.io.IOException;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		try {
			r.exec("C:\\Users\\Admin\\eclipse-workspace-java\\SeleniumPractice\\src\\misc\\Calc.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
