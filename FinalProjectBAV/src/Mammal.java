
public class Mammal {

	//Final Exam Code CMP 112 Bruce Anderson May 6 2015
	public static void main(String[] args) {}
		// TODO Auto-generated method stub


		private String location; //California, Indiana, Illinois
		private int legs; 
	
public Mammal(String mammalLocation, int mammalLegs) {
location = mammalLocation;
legs = mammalLegs;
	}
	
public String toString() {
return "Mammal class: " + mammalClass + " is located " + location + "Legs: " + legs;
	}
	
public String getLocation() {
return location;
	}
}
