import java.util.ArrayList;

public class AnotherFile {
// access modifier
//    |
//    |   return type
//    |     |
//    |     |   method name (class function)
//    |     |     |
//    V     V     V
    public void sayHi() {
        System.out.println("hello from AnotherFile");
    }

    public void sayHi(String someName) {
        System.out.println("Hello " + someName);
    }

    public Integer sum(int x, int y) {
        Integer thisSum = x + y;
        return thisSum;
    }

    public void doSomething(ArrayList<Integer> thisArray){
        System.out.println(thisArray);
        for (int i=0; i<thisArray.size(); i++) {
            // System.out.println(thisArray.get(i));
            System.out.println(thisArray.set(i, thisArray.get(i)) + 1000);
        }
    }

}