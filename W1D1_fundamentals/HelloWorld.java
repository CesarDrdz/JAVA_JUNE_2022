import java.util.Arrays;
import java.util.ArrayList;

public class HelloWorld {

    // ENTRY POINT TO OUR APP
    public static void main(String[] args) {
		// System.out.println("Hello Ninjas!");

        // --- VARIABLES ---
        // PRIMITIVE VARS
        boolean vote = true;
        boolean isAdmin; // false
        int number = 35;
        char w = 'w';
        double jacob = 26.25;

        // System.out.println(number);
        // System.out.println(w);

//  OBJECT TYPES
    String turtle = "green";
    Boolean x = true;
    Double pie = 3.14;

    int turtleLength = turtle.length();
    // System.out.println(turtle.length());

        // ARRAYS
        int[] myArray;
        myArray = new int[7];    // Initialization
        System.out.println(myArray); // [I@15db9742
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;
        // myArray[5] = 99;
        System.out.println(Arrays.toString(myArray)); //

        for (int i = 0; i < myArray.length; i++  ) {
            System.out.println(myArray[i]);
        }

        // DYNAMIC ARRAYS
        ArrayList<Integer> unicorns = new ArrayList<Integer>();
       unicorns.add(33);
       unicorns.add(44);
       unicorns.add(55);
       unicorns.add(66);
    //    unicorns.add("hello");
        System.out.println(unicorns);



    // instantiate and use OtherFile
    AnotherFile unicornFile = new AnotherFile();
    unicornFile.sayHi();
    unicornFile.sayHi("Aaron");
    Integer aSum = unicornFile.sum(22,33);
    System.out.println(aSum);

    // ----------------
    unicornFile.doSomething(unicorns);  

	}

    

}