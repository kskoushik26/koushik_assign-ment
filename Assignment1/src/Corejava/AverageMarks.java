package Corejava;
import java.util.*;

public class AverageMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
		String s;
		System.out.println("enter the name");
		s= sc.next();
		
		{
		int A,B,C,Avg ;
		System.out.println("enter the marks of A");
		A = sc.nextInt();
		System.out.println("enter the marks of B");
		B = sc.nextInt();
		System.out.println("enter the marks of C");
		C = sc.nextInt();
	
	
	
		Avg =((A+B+C)/3);
		System.out.println(Avg);
	
		}
	

}
	}
}
