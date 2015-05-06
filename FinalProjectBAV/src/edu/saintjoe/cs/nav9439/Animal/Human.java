package edu.saintjoe.cs.nav9439.Animal;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private String location;
		private int legs;
		private int children; 
	
public Mammal(String mammalLocation, int mammalLegs, int mammalChildren) {
location = mammalLocation;
legs = mammalLegs;
children = mammalChildren;
	}
	
public String toString() {
return "Mammal class: " + mammalClass + " is located " + location + "Legs: " + legs + children + "Children: " + children;
	}
	
public String getLocation() {
return location;
	}

public int getChildren() {
return children; 
	}
}


