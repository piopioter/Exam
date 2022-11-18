package org.exam.exercise2.app;


import org.exam.exercise2.services.ArrayServices;

import java.util.Arrays;

public class ArrayServicesRunner {
    public static void main(String[] args) {

        ArrayServices arrayServices = new ArrayServices();
        int[] array = {1, 2, 5, 6, 7, 34, 56, 22};

        arrayServices.printArrayElements(array);
        System.out.println();
        arrayServices.printArrayElementsReverse(array);
        System.out.println();


        int result = arrayServices.getBiggestNumber(array);
        System.out.println("Biggest element from array: " + result);

        int result1 = arrayServices.getSmallestNumber(array);
        System.out.println("Smallest element from array: " + result1);

        int result2 = arrayServices.sumOfElements(array);
        System.out.println("Sum of elements: " + result2);

        double result3 = arrayServices.medianArray(array);
        System.out.println("Median of array elements: " + result3);








    }
}
