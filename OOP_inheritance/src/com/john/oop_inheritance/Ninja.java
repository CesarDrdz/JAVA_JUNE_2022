package com.john.oop_inheritance;

public class Ninja {
	// MEMBER VARIABLES
    private String name; // null;
    private String belt;
    private int numberOfNinjaStars;
    private int health;
    public static int numberOfNinjasCreated = 0;
	
//    CONSTRUCTORS
    public Ninja() {
        this.name = "anonymous";
        this.health = 140;
        this.numberOfNinjasCreated++;
    }
    // overloading contructors
    public Ninja(String ninjaName, String belt, int numberOfNinjaStars) {
        this.name = ninjaName;
        this.belt = belt;
        this.numberOfNinjaStars = numberOfNinjaStars;
        this.health = 100;
        this.numberOfNinjasCreated++;
    }
    
 // METHODS
    public void displayStats() {
        System.out.println("NAME: "+ this.name);
        System.out.println("belt: "+ this.belt);
        System.out.println("health: "+ this.health);
    }

    public void attack(Ninja target, int power) {
        target.setHealth(target.getHealth() - power);
        System.out.println(target.getName() + " lost power by " + power + " and now has " + target.getHealth());
    }
    
//    GETTERS AND SETTERS
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBelt() {
		return belt;
	}
	public void setBelt(String belt) {
		this.belt = belt;
	}
	public int getNumberOfNinjaStars() {
		return numberOfNinjaStars;
	}
	public void setNumberOfNinjaStars(int numberOfNinjaStars) {
		this.numberOfNinjaStars = numberOfNinjaStars;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public static int getNumberOfNinjasCreated() {
		return numberOfNinjasCreated;
	}
	public static void setNumberOfNinjasCreated(int numberOfNinjasCreated) {
		Ninja.numberOfNinjasCreated = numberOfNinjasCreated;
	}



}
