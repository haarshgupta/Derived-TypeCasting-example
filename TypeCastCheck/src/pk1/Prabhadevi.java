package pk1;

import pk2.Mumbai;

public class Prabhadevi {
	String localFood = "ashok vada pav";

	public void famousNashta() {
		System.out.println("Prabhadevi's local foood is " + localFood + ".");
		Mumbai mb2 = new Mumbai();
		Prabhadevi pd1 = mb2;
		System.out.println("Down casted to mumbai n mumbai's local food is " + localFood);
	}

}
