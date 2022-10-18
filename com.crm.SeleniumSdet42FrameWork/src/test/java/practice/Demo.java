package practice;

import org.testng.annotations.Test;

public class Demo {

	@Test
	public void demoTest()
	{
		String var = System.getProperty("browser");
		System.out.println(var);
		
	}
}
