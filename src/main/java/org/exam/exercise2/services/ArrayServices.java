package org.exam.exercise2.services;

import java.util.Arrays;

public class ArrayServices {


    public void printArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public void printArrayElementsReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }


    public int getBiggestNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public int getSmallestNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double medianArray(int[] array) {
        Arrays.sort(array);
        double median;
        if (array.length % 2 != 0)
            median = array[array.length / 2];
        else
            median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;

        return median;
    }


}








