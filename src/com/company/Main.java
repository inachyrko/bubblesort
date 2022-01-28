package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arrayEasy = {3, 2, 1};

        bubbleSorting(arrayEasy);

    // write your code here




    }

    public static void bubbleSorting(int[] sortingArray) {
        int comparisons = 0;
        int swapsdone = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < sortingArray.length - 1; i++) {
                printArray(sortingArray);
                if (sortingArray[i] > sortingArray[i + 1]) {
                    System.out.println("swap" + sortingArray[i] + "and" + sortingArray[i + 1]);
                    int temp = sortingArray[i];
                    sortingArray[i] = sortingArray[i + 1];
                    sortingArray[i + 1] = temp;
                    swapsdone++;
                    sorted = false;
                } else {
                    //remove this comment!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    System.out.println("no need to change elements" + i + "and" + (i + 1));
                }
                comparisons++;

            }

        }
        System.out.println("comparisons=" + comparisons);
        System.out.println("swapsdone=" + swapsdone);


    }

    static void printArray(int[] arrayToPrint) {
        for (int i = 0; i <= arrayToPrint.length - 1; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

}
