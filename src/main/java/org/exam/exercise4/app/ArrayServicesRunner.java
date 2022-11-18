package org.exam.exercise4.app;

import org.exam.exercise4.services.ArrayServices;

public class ArrayServicesRunner {
    public static void main(String[] args) {


        String[] namesArray = new String[]{"Piotr", "Paweł", "Asia", "Marta", "Grzegorz", "Franek", "Kasia", "Karol",
                "Kamila", "Łukasz", "Kamil", "Weronika", "Izabela", "Mariusz", "Tomasz","Kuba"};

        ArrayServices arrayServices = new ArrayServices();

        String lengthResult = arrayServices.namesLength(namesArray);
        System.out.println(lengthResult);

        int womenResult = arrayServices.femaleNames(namesArray);
        System.out.println("There are " + womenResult + " women's names");

        double percentResult = arrayServices.getPercent(namesArray);
        System.out.println(percentResult + "% are women");


    }
}
