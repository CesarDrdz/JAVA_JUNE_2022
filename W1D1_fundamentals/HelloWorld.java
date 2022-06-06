import java.util.Arrays;
import java.util.ArrayList;

public class HelloWorld {

    // entry point to compile
    // EVERYTHING will be executed within that method
    public static void main(String[] args) {
        
        // System.out.println("Hello World!!!");
        // System.out.println("Welcome to JAVA!!!");

        // --- VARIABLES ---
        // primitive types
        boolean vote = true;
        int number = 123;
        double tax = 3.4;
        float xx = 4; // 4.0
        float yy = 3.14f;
        char letter = 'a';

        // Object Types (Class Wrappers)
        Boolean isAdmin = true;
        Integer width = 33;
        Double pie = 3.14;
        String name = "Ederick";
        // System.out.println(name.length());

        int nameLength = name.length();
        System.out.println(nameLength);

        // String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        // System.out.println(ninja);

        // ==== String methods ====
        // Normal string assignment
        String a = "same string";
        String b = "same string";
        System.out.println(a == b); 

        // Creating new strings as separate objects (another way to create a String)
        String x = new String("same letters");
        String y = new String("same letters");
        System.out.println(x == y);
        System.out.println(x.equals(y));
        
        System.out.println("-------------------------------");

        // import the other Class here
        AnotherFile unicorns = new AnotherFile();
        // System.out.println(unicorns);
        unicorns.sayHi();
        
        // System.out.println(unicorns.sayHelloName());
        String output = unicorns.sayHelloName();
        System.out.println(output);

        System.out.println(unicorns.sayHelloName("John"));
        // -----------------
        System.out.println(unicorns.sum(11,22));
        
        // --------------------------
        // ARRAYS
        // primitive Arrays
        int[] numbers; // variable declaration
        String firstName; // null

        numbers = new int[5]; // [0,0,0,0,0]
        numbers[0] = 11;
        numbers[2] = 22;
        numbers[3] = 33;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] myArray = {44,55,66,77};
        boolean[] votes = {true, false, true};
        char[] alphabet = {'a', 'b', 'c'};
        // --------------------
        // ARRAYLIST
        ArrayList<Integer> coolIntegers = new ArrayList<Integer>();
        System.out.println(coolIntegers);
        coolIntegers.add(33);
        coolIntegers.add(55);
        coolIntegers.add(99);
        System.out.println(coolIntegers); // [33,55,99]

        // unicorns.manipulateArray(coolIntegers);
        ArrayList<Integer> newArray = unicorns.manipulateArray(coolIntegers);
        System.out.println(newArray);

    }
}