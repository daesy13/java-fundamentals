/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {
//    public boolean someLibraryMethod() {
//        return true;
//    }

    static void roll(int n){
        double randgen = (Math.random() * 6) + 1;
        System.out.println(randgen);
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++){
            newArr[i] = randgen;
        }
    }
}
