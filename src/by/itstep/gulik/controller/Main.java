package by.itstep.gulik.controller;

import by.itstep.gulik.model.ArrayWorker;

public class Main {
    public static void main(String[] args) {
        int size = 2_000_000;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }


        ArrayWorker.checkValue(array,2_000_000);
        ArrayWorker.binarySearch(array, 2_000_000);

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        for (int item: array) {
//            item *= 2;
//        }
//
//        for (int item: array) {
//            System.out.print(item + " ");
//        }

//        System.out.println(array);

    }
}
