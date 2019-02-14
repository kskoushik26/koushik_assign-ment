package com.koushik.ju;
import org.junit.*;

public class SampleClass 
{
  
  @BeforeClass
  public static void first()
  {
	  System.out.println("running beforeclass class");
  }
  @AfterClass
  public static  void fifth()
  {
	  System.out.println(" Afterclass class cases ");
  }
 
  @Before
  public void second()
  {
	  System.out.println(" before class");
  }
  @After
  public   void fourth()
  {
	  System.out.println(" after cases ");
  }
  @Test
  public  void third()
  {
	  System.out.println("third test cases 1");
  }
  
  @Test
  public  void third2()
  {
	  System.out.println("third test cases 3");
  }
  @Test
  public   void third4()
  {
	  System.out.println("Fourth test cases 4");
  }
  @Test
  public  void third5()
  {
	  System.out.println("fifth test cases 5");
  }
  
  
}

