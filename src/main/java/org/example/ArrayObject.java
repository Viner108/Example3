package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayObject {
    public static void main(String[] args) {
        int[] array=intit(20);
        int[] object = new int[6];
        int[] object2 = new int[6];
        int[] object3 = new int[2];
        objectCreate(array,object);
        objectCreate(array,object2);
        objectCreate(array,object3);
    }

    public static int[] intit(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        printLines(array);
        return array;
    }

    private static boolean objectCreate(int[] array,int[] object) {
        int star=finStart(array);
        if(array.length-star<object.length) {
        return false;
        }
        array[star] = object.length;
        for (int i = 0; i < object.length; i++) {
                array[star+i+1]=object[i];
            printLines(array);
        }
        return true;
    }

    private static int finStart(int[] array) {
        int i=0;
        while (array[i]!=-1){
            i++;
        }
        return i;
    }

    public static boolean insert(int[] array, int[] object) {

        return false;

    }

    public static int getCount(int[] array) {
        int i = 0;
        return i;
    }

    public static int[] getByIndex(int[] array, int index) {
        return array;
    }

    private static void printLines(int[] lines) {
        System.out.print("[");
        for (int i = 0; i < lines.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(lines[i]);
        }
        System.out.println("]");
    }
}