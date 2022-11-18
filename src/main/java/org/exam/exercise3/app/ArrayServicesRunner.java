package org.exam.exercise3.app;

import org.exam.exercise3.services.ArrayServices;

import java.util.Arrays;

public class ArrayServicesRunner {
    public static void main(String[] args) {


        int[] arrayOne = {-1, 4, 2, 6, 7, 3};
        int[] arrayTwo = {4, 3, 5, 8, -1};

        ArrayServices arrayServices = new ArrayServices();
        int[] result = arrayServices.theSameNumber(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(result));


    }
}
