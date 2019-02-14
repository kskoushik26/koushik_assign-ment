package mammals;

public class Mammals {
public void eat(Mammals m){System.out.println("mammalas");}

public static void main(String[] args) {
	Mammals m=new Horse();
	Cattle c= new Horse();

	m.eat(c);
	
	
}
}
class Cattle extends Mammals {
public void eat(Cattle c){System.out.println("Cattle");}
}

class Horse extends Cattle {
public void eat(Horse h){System.out.println("horse");}
}
