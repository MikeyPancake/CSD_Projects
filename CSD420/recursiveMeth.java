package CSD420;

public class recursiveMeth {

    public static void main (String[] args){

        sayHi(5);
    }


    private static void sayHi(int count){
        System.out.println("Hi!");

        // Base case
        // If the method is called with 1 or less than it will only recurse 1 time
        if (count <= 1){
            return;
        }

        // If the method is called with more than 1 it will continue to recurse until the base case parameter is reached
        // The -1 is used to reduce the recursive amount by 1 so that the base case parameter can be met
        sayHi(count - 1);
    }
}
