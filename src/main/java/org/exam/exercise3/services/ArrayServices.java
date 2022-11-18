package org.exam.exercise3.services;


public class ArrayServices {


    public int[] theSameNumber(int[] array1, int[] array2) {
        int size = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array2.length; k++) {
                if (array1[i] == array2[k])
                    size++;

            }
        }
        int j = 0;
        int[] sameNumberArray = new int[size];
        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array2.length; k++) {
                if (array1[i] == array2[k])
                    sameNumberArray[j++] = array1[i];

            }
        }
        return sameNumberArray;
    }
}