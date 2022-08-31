package example;

public class Airtel implements Sim{
 private int cost;
	
	public int getCost() {
	return cost;
}


public void setCost(int cost) {
	this.cost = cost;
}


	public void typeOfSim() {
		System.out.println("this is airtel sim");
		
	}

	
	public void dataTypeOfSim() {
		System.out.println("airtel has 5G good network");
	}

}
