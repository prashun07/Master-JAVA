//Take random array input from the console ,store it in the array,
//sort the array and print
//take a target and search it in array
//take a value and remove from the array
package collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= sc.nextInt();
        }
        Arrays.sort(array);
//        Arrays.sort(arrayList);// ArrayList don't have sort() methods
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
