package com.john.oop_inheritance;

public class Sensei extends SuperNinja implements Knowledgeable {

//	CONSTRUCTOR
	public Sensei(String name) {
		super(name, "black", 9999);
	}
	
	
	@Override
	public String sayWisdom() {
		return this.getName() + " you are coool";
	}

}
