package TestNG;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ReportingTests {
	
@Test
public void TestCase1(){
	System.out.println("Test Case 1");
}

@Test
public void TestCase2(){
	
	Assert.assertEquals(1, 2);
	System.out.println("Test Case 2");
}

@Test
public void TestCase3(){
	System.out.println("Test Case 3");
}

@Test
public void TestCase4(){
	try
	{
		Assert.assertTrue(4<1, "False Condition in TC 4");
		System.out.println("Test Case 4");
	}
	catch(Throwable t)
	{
		System.out.println(t);
	}
	System.out.println(" False Condition Test Case 4");
	
}
	

}
