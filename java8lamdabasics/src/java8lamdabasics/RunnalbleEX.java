package java8lamdabasics;

public interface RunnalbleEX 
{
	public static void main(String[] args) {
		Thread mythread = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("runnable is printed");
			}
				// TODO Auto-generated method stub
				});
		mythread.run();
		
		Thread mythread1=new Thread(()->System.out.println("runnable is lambda printed"));
		mythread1.run();
	}
}
