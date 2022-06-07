public class TestNinja {
    public static void main(String[] args) {

        Ninja kikomo = new Ninja("Kikomo");

        // kikomo.displayStats();
        Sword samehanda = new Sword("samehanda");
        kikomo.pickUpSword(samehanda);
        kikomo.eatStrawberry();
        kikomo.displayStats();

        Ninja corey = new Ninja("Corey");
        Sword rubicsCube = new Sword("Ribic's Cube");
        // pick up the sword
        corey.pickUpSword(rubicsCube);

        kikomo.fight(corey);
        System.out.println("---------");
        corey.displayStats();


        
    }
}