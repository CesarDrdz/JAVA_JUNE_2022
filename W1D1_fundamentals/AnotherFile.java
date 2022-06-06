import java.util.ArrayList;

public class AnotherFile{
// access modifier
//    |
//    |   return type
//    |     |
//    |     |   method name (class function)
//    |     |     |
//    V     V     V
    public void sayHi() {
        System.out.println("hello unicorns");
        // no return statement here
    }
    
    public String sayHelloName() {
        // System.out.println("hello unicorns");
        return "hello from JAVA!";
        // must have a return of type String
    }

    public String sayHelloName(String myName) {
        return "hello " +  myName;
    }

    public Integer sum(int x, int y){
        Integer mySum = x + y;
        if (x > 10) {
            return x;
        }
        return mySum;
    }


    public ArrayList<Integer> manipulateArray(ArrayList<Integer> thisArray) {
        // System.out.println(thisArray);
        for(int i = 0; i< thisArray.size(); i++) {
            // System.out.println(thisArray.get(i) + 100);
            System.out.println(thisArray.set(i, thisArray.get(i)+ 100));
        }

        return thisArray;
        
    }

}