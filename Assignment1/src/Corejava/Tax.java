package Corejava;
import java.util.*;

public class Tax 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double salary,tax;
		System.out.println("enter the salary amount");
		salary=sc.nextDouble();
		if(salary < 180000)
		{
			
			System.out.println("Slab A");
			System.out.println("Nill");
		}
		else if(salary >180000 && salary < 300000)
		{
			System.out.println("Slab B");
			System.out.println("The tax is " +salary*0.1);
		}
		else if(salary >300000 && salary < 500000)
		{
			System.out.println("Slab C");
			System.out.println("The tax is " +salary*0.2);
			
			}
		else 
		{
			System.out.println("Slab D");
			System.out.println("The tax is " +salary*0.3);
		}
	}

}
