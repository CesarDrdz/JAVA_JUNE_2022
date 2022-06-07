public class NinjaTest {

    // entry point
    public static void main(String[] uniconrs) {

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

        // Ninja.numberOfNinjasCreated;
    }


}