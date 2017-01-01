package domains.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Aaron on 12/30/2016.
 */

//https://www.hackerrank.com/challenges/insertionsort1
public class InsertionSort1 {

    static void insertionSort(int[] arrayItems) {
        int lastPosition = arrayItems.length - 1;
        int itemToBeInserted = arrayItems[lastPosition];
        while (lastPosition > 0 && arrayItems[lastPosition - 1] > itemToBeInserted) {
            arrayItems[lastPosition] = arrayItems[lastPosition - 1];
            --lastPosition;
            printOurArray(arrayItems);
        }
        arrayItems[lastPosition] = itemToBeInserted;
        printOurArray(arrayItems);
    }

    static void printOurArray(int[] ar) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int n : ar) {
            stringBuffer.append(n).append(" ");
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] ourArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            ourArray[i++] = in.nextInt();
        }
        insertionSort(ourArray);
    }
}
