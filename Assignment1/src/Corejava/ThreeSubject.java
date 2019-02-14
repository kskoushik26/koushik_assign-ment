package Corejava;
import java.util.*;

public class ThreeSubject
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A,B,C,result ;
		System.out.println("enter the marks of A");
		A = sc.nextInt();
		System.out.println("enter the marks of B");
		B = sc.nextInt();
		System.out.println("enter the marks of C");
		C = sc.nextInt();
		result=A+B+C;
		if (result>60)
		{
			System.out.println("passed");
			}
		else if(((A+B)>60) ||((A+C)>60)||((B+C))>60)
		{
			System.out.println("promoted");
		}
		else
		{
			System.out.println("failed");
		}
	}
	

}
