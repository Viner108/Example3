package org.example;

public class ArrayObject {
    public static void main(String[] args) {
//        testCreate();
//        testUpdate();
//        testGetByIndex();
//        testDeleteObject();
//        testDeleteFromMiddle();
        testInsertObject();
    }

    private static void testCreate() {//тест функции objectCreate
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

    private static void testUpdate() {//тест функции testUpdate
        int[] array = intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        int indexofobject = 1; // индекс объекта
        int value = 131;// значение для внесения его в объект
        int index = 1;// индекс значение в объкте
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

    private static void testGetByIndex() {//тест функции testGetByIndex
        int[] array = intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        int indexofobject = 1; // индекс
        int[] array2 = getByIndex(array, indexofobject);
        printLines(array2);
        if (!(array2[0] == 0 &&
                array2[1] == 0)) {
            System.out.println("error testGetByIndex");
        }
    }

    private static void testDeleteObject() {//тест функции testDeleteObject
        int[] array = intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        int indexofobject = 1; // индекс объекта
        int[] array2 = deleteObject(array, indexofobject);
        printLines(array2);
        if (!(array2[0] == -1 &&
                array2[1] == -1 &&
                array2[2] == -1 &&
                array2[3] == -1 &&
                array2[4] == -1)) {
            System.out.println("error testDeleteObject");
        }
    }

    private static void testDeleteFromMiddle() {//тест функции testDeleteFromMiddle
        int[] array = intit(9);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[2];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[2];// третий объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        objectCreate(array, object2);// функция для размещение второго объкта в массиве
        objectCreate(array, object3);// функция для размещение третьего объкта в массиве
        int indexofobject = 2; // индекс объекта
        int[] array2 = deleteFromMiddle(array, indexofobject);
        printLines(array2);
        if (!(array2[0] == 2 &&
                array2[1] == 0 &&
                array2[2] == 0 &&
                array2[3] == 2 &&
                array2[4] == 0 &&
                array2[5] == 0 &&
                array2[6] == -1 &&
                array2[7] == -1 &&
                array2[8] == -1)) {
            System.out.println("error testDeleteFromMiddle");
        }
    }

    private static void testInsertObject() {//тест функции testInsertObject
        int[] array = intit(9);//создает массив заполненный -1
        int[] object = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[1];// третий объект для размещенние в массив с нулевыми значениями
        int[] object4 = new int[2];// третий объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        objectCreate(array, object2);// функция для размещение второго объкта в массиве
        objectCreate(array, object3);// функция для размещение третьего объкта в массиве
        int indexofobject = 2; // индекс объекта
        int[] array2 = insertObject(array, indexofobject, object4);
        printLines(array2);
        if (!(array2[0] == 1 &&
                array2[1] == 0 &&
                array2[2] == 1 &&
                array2[3] == 0 &&
                array2[4] == 2 &&
                array2[5] == 0 &&
                array2[6] == 0 &&
                array2[7] == 1 &&
                array2[8] == 0 )) {
            System.out.println("error testInsertObject");
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
        int start = finStart(array);
        if (array.length - start < object.length + 1) {
            return false;
        }
        array[start] = object.length;
        for (int i = 0; i < object.length; i++) {
            array[start + i + 1] = object[i];
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
        while (i < array.length && array[i] != -1) {
            i = i + array[i] + 1;
            j++;
        }
        return j;
    }

    public static int getAdress(int[] array, int indexofobject) {//функция возвращающая индекс начала определенного объекта
        int j = -1;
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

    private static int[] deleteFromMiddle(int[] array, int indexofobject) {//функция удаляет определенный объект
        // и сдвигает оставщиеся в левую сторону
        int start = getAdress(array, indexofobject);
        int count = getCount(array);
        int[] array2 = deleteObject(array, indexofobject);
        while (array2[start] == -1 && count != indexofobject) {
            for (int i = 1; i < array2.length; i++) {
                if (i < array2.length && array2[i] != -1) {
                    int temp = array2[i - 1];
                    array2[i - 1] = array2[i];
                    array2[i] = temp;
                }
            }
        }
        printLines(array2);
        return array2;
    }

    private static int[] insertObject(int[] array, int indexofobject, int[] object) {//функиция для вставки определенного объекта
        //на конкретный индекс объекта со сдгивом остальных вправо
        int start = getAdress(array, indexofobject);
        int elements =finStart(array);
        int j=0;
        if (object.length<=array.length-elements-1) {//условие для просмотра количества оставщейся памяти в массиве
            while (array[start] != -1 || j != object.length + 1) {
                for (int i = array.length - 1; i > start; i--) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
                j++;
                printLines(array);
            }
            array[start] = object.length;
            for (int i = 0; i < object.length; i++) {
                array[start + i + 1] = object[i];

            }
        }
        printLines(array);
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