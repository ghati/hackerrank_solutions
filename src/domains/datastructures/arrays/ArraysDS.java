package domains.datastructures.arrays;

import java.util.Scanner;

/**
 * Created by Aaron on 12/24/2016.
 */

//link here https://www.hackerrank.com/challenges/arrays-ds

public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the array size and press enter key");
        int arraySize = in.nextInt();

        System.out.println("Now enter " + arraySize + " integers while pressing enter key after each integer");
        int ourArray[] = new int[arraySize];

        for (int arr_i = 0; arr_i < arraySize; arr_i++) {
            ourArray[arr_i] = in.nextInt();
        }

        System.out.println("Here is your reversed list!");
        System.out.println("=====================================");
        for (int i = arraySize; i > 0; i--) {
            System.out.print(ourArray[i-1] + " ");
        }
        System.out.println();
        System.out.println("=====================================");
    }
}
