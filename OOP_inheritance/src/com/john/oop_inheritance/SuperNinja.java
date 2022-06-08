package com.john.oop_inheritance;

public class SuperNinja extends Ninja {
	
	private Boolean integrity;
	private int laserPower;
	
//	CONSTRUCTOR(s)
//	overloading
	public SuperNinja(String name, String belt, int stars) {
		super(name, belt, stars);
		this.laserPower = 20;
	}
//	public SuperNinja() {};
	
	
	public void fly() {
		if (this.getBelt().equals("black")) {
			System.out.println(this.getName() + ": weeeee I'm flying!");
		} else {
			System.out.println(this.getName() + ":git gud");
		}
	}
	
    public void attack(Ninja target, int power) {
        target.setHealth(target.getHealth() - power - this.getLaserPower());
        System.out.println(target.getName() + " lost power by " + power + " and now has " + target.getHealth());
    }
    
    public void simpleAttack(Ninja target, int power) {
    	super.attack(target, power);
    }

//----- GETTERS AND SETTERS -----
	public Boolean getIntegrity() {
		return integrity;
	}


	public void setIntegrity(Boolean integrity) {
		this.integrity = integrity;
	}


	public int getLaserPower() {
		return laserPower;
	}


	public void setLaserPower(int laserPower) {
		this.laserPower = laserPower;
	}
	
	
}
