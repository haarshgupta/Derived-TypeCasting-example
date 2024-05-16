package pk4;
import pk3.Pune;
public class Maharashtra extends Pune {

	@Override
public void famousNashta() {
	String localFood="misal pav..";
	System.out.println("Maharashtra's local food is "+localFood+".");
	
}
	
public static void main(String[] args) {
	Pune pune1=new Pune();
//	System.out.println(pune1.localFood);//poha..
	pune1.famousNashta();
	
	
	Maharashtra mh1=new Maharashtra();
	mh1.famousNashta();//misal pav..

//	Maharashtra mh2=new Pune();//--Throws compile time error..
	Pune pune2=(Pune)new Maharashtra();//--prep for downCasting making child type place in heap n storing its refference to parent type.
	Maharashtra mh2=(Maharashtra)pune2;
	mh2.famousNashta();//--downCasted parent(Pune) to child(Maharashtra)--//misal pav
	
	Pune pune3=mh1;//--upCasting.
	
	
}
}
