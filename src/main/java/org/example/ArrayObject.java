package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayObject {
    public static void main(String[] args) {
        int[] array = intit(40);//создает массив заполненный -1
        int[] object = new int[6]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[6];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[13];// третий объект для размещенние в массив с нулевыми значениями
        int indexofobject = 3; // индекс объекта в котором нужно заменить значение
        int value = 131;// значение для замены в объекте
        int index = 9;// индекс значение в объкте который нужно заменить
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        objectCreate(array, object2);// функция для размещение второго объкта в массиве
        objectCreate(array, object3);// функция для размещение третьего объкта в массиве
        update(array, index, indexofobject, value); //функция для замены значения в определенной объекте
        System.out.println(getCount(array));
        System.out.println(getAdress(array,indexofobject));
    }

    public static int[] intit(int size) { // функция для создания и заполнения исходного массива
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        printLines(array);
        return array;
    }

    private static boolean objectCreate(int[] array, int[] object) { // функция для размещения объекта в массиве
        int star = finStart(array);
        if (array.length - star < object.length) {
            return false;
        }
        array[star] = object.length;
        for (int i = 0; i < object.length; i++) {
            array[star + i + 1] = object[i];
        }
        printLines(array);
        return true;
    }

    private static int finStart(int[] array) { // функция для подсчета количества элементов в предыдущем объекте
        int i = 0;
        while (array[i] != -1) {
            i++;
        }
        return i;
    }


    public static boolean update(int[] array, int index, int indexofobject, int value) {//функиця для замены значения в
        //оперделенной объекте
        int j = 0;
        for (int i = 0; array[i] != -1; i = i + array[i] + 1) {
            j++;
            if (j == indexofobject &&index<array[i]) {
                array[i + index + 1] = value;
                printLines(array);
                return true;
            }
        }
        return false;
    }

    public static int getCount(int[] array) {//функция считает количество объектов в массиве
        int j = 0;
        int i = 0;
        while (array[i] != -1) {
            i = i + array[i] + 1;
            j++;
        }
        return j;
    }

    public static int getAdress(int[] array, int indexofobject) {//функция пвзвращающая индекс начала определенного объекта
        int j = 0;
        for (int i = 0; array[i] != -1; i = i + array[i] + 1) {
            j++;
            if (j == indexofobject)
                return i;
        }
        return -1;
    }

    private static void printLines(int[] lines) {//функция для выведения массива на консоль
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