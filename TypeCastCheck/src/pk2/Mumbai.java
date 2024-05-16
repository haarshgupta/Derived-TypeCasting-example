package pk2;

import pk1.Prabhadevi;

public class Mumbai extends Prabhadevi {
String localFood="vada pav.";
public void famousNashta() {
	System.out.println("Mumbai's local food is "+localFood+".");
	Prabhadevi pd1=new Prabhadevi();
//	Mumbai mb1=(Mumbai)pd1 ;//--upCasting
	Mumbai mb4= new Mumbai();
	Mumbai mb2=(Mumbai)mb4;//--upCasting
	System.out.println(mb2);

		}
public static void main(String args[]) {
	Mumbai mb3=new Mumbai();
	mb3.famousNashta();
}
}
