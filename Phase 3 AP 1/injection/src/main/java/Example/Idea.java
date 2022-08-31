package example;

public class Idea implements Sim{

	private int cost;
	public Idea(int cost) {
		this.cost = cost;
	}


	public void typeOfSim() {
		System.out.println("this is idea sim");
	}

	
	public void dataTypeOfSim() {
		System.out.println("idea has poor connection");
		
	}
public void display() {
	System.out.println(cost);
}
}
