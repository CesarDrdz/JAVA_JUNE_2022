public class Ninja{

// MEMBER VARIABLES
    private String name; // null;
    private String belt;
    private int numberOfNinjaStars;
    private int health;
    public static int numberOfNinjasCreated = 0;
    // private int SSN;

    // CONSTRUCTOR
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

    // --- GETTERS AND SETTERS
    // GETTER - name
    public String getName() {
        return this.name;
    }
    // SETTER - name
    public void setName(String someName) {
        this.name = someName;
    }

        // GETTER - name
    public int getHealth() {
        return this.health;
    }
    // SETTER - name
    public void setHealth(int health) {
        this.health = health;
    }

}