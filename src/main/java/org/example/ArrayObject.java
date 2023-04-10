package org.example;

public class ArrayObject {
    public static void main(String[] args) {
        testCreate();
         testUpdate();
    }

    private static void testCreate() {
        int[] array = intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        if (!(array[0] == 2 &&
                array[1] == 0 &&
                array[2] == 0 &&
                array[3] == -1 &&
                array[4] == -1
        )) {
            System.out.println("error testCreate");
        }
    }

    private static void testUpdate() {
        int[] array = intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        int indexofobject = 1; // индекс объекта в котором нужно заменить значение
        int value = 131;// значение для замены в объекте
        int index = 1;// индекс значение в объкте который нужно заменить
        update(array, index, indexofobject, value); //функция для замены значения в определенной объекте
        if (!(array[0] == 2 &&
                array[1] == 0 &&
                array[2] == 131 &&
                array[3] == -1 &&
                array[4] == -1
        )) {
            System.out.println("error testUpdate");
        }
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
        int start = getAdress(array, indexofobject);
        if (start != -1 && index < array[start]) {
            array[start + index + 1] = value;
            printLines(array);
            return true;
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

    public static int getAdress(int[] array, int indexofobject) {//функция возвращающая индекс начала определенного объекта
        int j = 0;
        int count = getCount(array);
        for (int i = 0; array[i] != -1; i = i + array[i] + 1) {
            j++;
            if (j == indexofobject && j <= count) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getByIndex(int[] array, int indexofobject) {//функция выводит на консоль конкретный объект
        int start = getAdress(array, indexofobject);
        int[] error = new int[0];
        if (start != -1) {
            int[] array2 = new int[array[start]];
            for (int i = start + 1; i < start + array[start]; i++) {
                array2[i - start - 1] = array[i];
                return array2;
            }
        }
        return error;//если объекта под конкретным номером нет, то на консоль выводится пустой массив
    }

    public static int[] deleteObject(int[] array, int indexofobject) {//функция удаления конкретного объекта
        int start = getAdress(array, indexofobject);
        int[] array2 = getByIndex(array, indexofobject);
        if (start != -1) {
            for (int i = start; i < start + array2.length + 1; i++) {
                array[i] = -1;
            }
        }
        return array;
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