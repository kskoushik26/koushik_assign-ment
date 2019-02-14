package java8lamdabasics;

public class TypeInference 
{
	 public static void main(String[] args) {
		
		 StringLength Mylambda=  s -> s.length();
		System.out.println( Mylambda.getLength("hello there"));
	}
	 interface StringLength{
		 int getLength(String s);
	 }

}
