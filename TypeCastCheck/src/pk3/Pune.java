package pk3;
import pk2.Mumbai;
import pk4.Maharashtra;

public class Pune extends Mumbai {

public void famousNashta() {
	 String localFood="poha..";
	System.out.println("Pune's local food is "+localFood+".");
										
}
public static void main(String args[]) {
	Pune pu1=new Pune();
	Pune pn2=new Maharashtra();//upCasting child to parent (Maharashtra to pune).
	Maharashtra mh5=new Maharashtra();
	mh5.famousNashta();//misal pav.
	Pune pn3=(Pune)mh5;
	pn3.famousNashta();//poha..
}
}
