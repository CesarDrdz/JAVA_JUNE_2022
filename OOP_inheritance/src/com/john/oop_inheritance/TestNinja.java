package com.john.oop_inheritance;

public class TestNinja {

	public static void main(String[] args) {

		Ninja bob = new Ninja();
        System.out.println(bob.getName());
        // System.out.println(bob.health);

        Ninja Corey = new Ninja("C", "yellow", 41 ); 
        String ninjaName1 = Corey.getName();
        System.out.println(ninjaName1);

        Ninja Jamie = new Ninja("Goku", "black", 90001);

        Jamie.displayStats();
        Jamie.attack(Corey, 1);
        Corey.displayStats();
        
        SuperNinja davita = new SuperNinja("Davita", "black", 9999);
        SuperNinja palmer = new SuperNinja("notCorey", "red", 7);

        davita.fly();
        palmer.fly();
        
        davita.attack(palmer, 1);
        palmer.simpleAttack(davita, 2);
        
        
        
        // Ninja.numberOfNinjasCreated;
	}

}
