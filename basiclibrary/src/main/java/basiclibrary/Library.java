/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.Arrays;
import java.util.Random;

public class Library {
//    public boolean someLibraryMethod() {
//        return true;
//    }

    static int[] roll(int n){
        Random randgen = new Random();
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++){
            newArr[i] = randgen.nextInt(6);
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    static boolean containsDuplicates( String[] args){
        boolean result = true;
        for (int i = 0; i < args.length; i++) {
            for (int j = args.length - 1; j >= 0; j--){
                if (args[i] == args[j]) {
                    return result;
                } else {
                    return result = false;
                }
            }
        }
        return result;
    }

}
