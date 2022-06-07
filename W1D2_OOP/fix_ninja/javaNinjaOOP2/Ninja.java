class Ninja {

    private String name;
    private int health;

    //// NEW Member Variable: ////
    private Sword sword; //null

    public Ninja(String name){
        this.name = name;
        this.health = 100;
    }

    public void displayStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Health:" + this.getHealth());
        System.out.println(this.getName() +  " has a sword called " + this.sword.type);
        
        
        // What code would you add if any?
    }

    public void eatStrawberry(){
        // this.health += 10;
        this.setHealth(this.getHealth() + 10);
    }

    // YOUR CODE HERE:
    public void pickUpSword(Sword swordType) {
        this.setSword(swordType);
        // Add the code to give the ninja a sword
    }

    // fight
    public int fight(Ninja otherNinja) {
        otherNinja.setHealth(otherNinja.getHealth() - this.getSword().getIntegrity());
        return otherNinja.getHealth();
    }


    // GETTERS & SETTERS
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sword getSword() {
        return this.sword;
    }
    public void setSword(Sword theSword) {
        this.sword = theSword;
    }
}