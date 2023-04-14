package org.example;

public class ArrayObject {
    public static void main(String[] args) {
//        testCreate();
//        testUpdate();
//        testGetByIndex();
//        testDeleteObject();
//        testDeleteFromMiddle();
//        testInsertObject();
//        testSwap();
        testShift();
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
        } else {
            System.out.println("correct testCreate");
        }
    }

    private static void testUpdate() {//тест функции update
        int[] array = intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        int indexofobject = 0; // индекс объекта
        int value = 131;// значение для внесения его в объект
        int index = 1;// индекс значение в объкте
        update(array, index, indexofobject, value); //функция для замены значения в определенной объекте
        printLines(array);
        if (!(array[0] == 2 &&
                array[1] == 0 &&
                array[2] == 131 &&
                array[3] == -1 &&
                array[4] == -1
        )) {
            System.out.println("error testUpdate");
        } else {
            System.out.println("correct testUpdate");
        }
    }

    private static void testGetByIndex() {//тест функции getByIndex
        int[] array = intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        int indexofobject = 0; // индекс
        int[] array2 = getByIndex(array, indexofobject);
        printLines(array2);
        if (!(array2[0] == 0 &&
                array2[1] == 0)) {
            System.out.println("error testGetByIndex");
        } else {
            System.out.println("correct testGetByIndex");
        }
    }

    private static void testDeleteObject() {//тест функции deleteObject
        int[] array = intit(6);//создает массив заполненный -1
        int[] object = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object1 = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        objectCreate(array, object1); // функция для размещение первого объкта в массиве
        int indexofobject = 1; // индекс объекта
        int[] array2 = deleteObject(array, indexofobject);
        printLines(array2);
        if (!(array2[0] == 1 &&
                array2[1] == 0 &&
                array2[2] == -1 &&
                array2[3] == -1 &&
                array2[4] == -1 &&
                array2[5] == -1)) {
            System.out.println("error testDeleteObject");
        } else {
            System.out.println("correct testDeleteObject");
        }
    }

    private static void testDeleteFromMiddle() {//тест функции deleteFromMiddle
        int[] array = intit(9);//создает массив заполненный -1
        int[] object = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[2];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[3];// третий объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        objectCreate(array, object2);// функция для размещение второго объкта в массиве
        objectCreate(array, object3);// функция для размещение третьего объкта в массиве
        int indexofobject = 0; // индекс объекта
        int[] array2 = deleteFromMiddle(array, indexofobject);
        printLines(array2);
        if (!(array2[0] == 2 &&
                array2[1] == 0 &&
                array2[2] == 0 &&
                array2[3] == 3 &&
                array2[4] == 0 &&
                array2[5] == 0 &&
                array2[6] == 0 &&
                array2[7] == -1 &&
                array2[8] == -1)) {
            System.out.println("error testDeleteFromMiddle");
        } else {
            System.out.println("correct testDeleteFromMiddle");
        }
    }

    private static void testInsertObject() {//тест функции insertObject
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
                array2[8] == 0)) {
            System.out.println("error testInsertObject");
        } else {
            System.out.println("correct testInsertObject");
        }
    }

    private static void testSwap() {//тест функции swap
        int[] array = intit(11);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[4];// третий объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        objectCreate(array, object2);// функция для размещение второго объкта в массиве
        objectCreate(array, object3);// функция для размещение третьего объкта в массиве
        int indexofobject1 = 0;
        int indexofobject2 = 2;
        int value = 131;// значение для внесения его в объект
        int index = 0;// индекс значение в объкте
        update(array, index, indexofobject1, value); //функция для замены значения в определенной объекте
        update(array, 1, indexofobject1, 10); //функция для замены значения в определенной объекте
        update(array, index, indexofobject2, 12);//функция для замены значения в определенной объекте
        update(array, 2, indexofobject2, 20);//функция для замены значения в определенной объекте
        int[] array2 = swap(array, indexofobject1, indexofobject2);
        printLines(array2);
        if (!(array2[0] == 4 &&
                array2[1] == 12 &&
                array2[2] == 0 &&
                array2[3] == 20 &&
                array2[4] == 0 &&
                array2[5] == 1 &&
                array2[6] == 0 &&
                array2[7] == 2 &&
                array2[8] == 131 &&
                array2[9] == 10 &&
                array2[10] == -1)) {
            System.out.println("error testSwap");
        } else {
            System.out.println("correct testSwap");
        }
    }

    private static void testShift() {//тест функции swap
        int[] array = intit(11);//создает массив заполненный -1
        int[] object = new int[4]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[3];// третий объект для размещенние в массив с нулевыми значениями
        objectCreate(array, object); // функция для размещение первого объкта в массиве
        objectCreate(array, object2);// функция для размещение второго объкта в массиве
        objectCreate(array, object3);// функция для размещение третьего объкта в массиве
        int indexofobject1 = 0;
        int indexofobject2 = 2;
        int[] array2 = shift(array, indexofobject1, indexofobject2);
        printLines(array2);
        if (!(array2[0] == 4 &&
                array2[1] == 0 &&
                array2[2] == 0 &&
                array2[3] == 0 &&
                array2[4] == 1 &&
                array2[5] == 0 &&
                array2[6] == 0 &&
                array2[7] == 3 &&
                array2[8] == 0 &&
                array2[9] == 0 &&
                array2[10] == 0)) {
            System.out.println("error testShift");
        } else {
            System.out.println("correct testShift");
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
        int j = -1;
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
            for (int i = start + 1; i < start + array[start] + 1; i++) {
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
        int lenght = array[start];
        int count = getCount(array);
        int[] array2 = deleteObject(array, indexofobject);
        printLines(array2);
        while (array2[start] == -1 && count != indexofobject) {
            for (int i = start; i < array.length; i++) {
                if (array2[i] != -1) {
                    int temp = array2[i];
                    array2[i] = array2[i - 1];
                    array2[i - 1] = temp;
                    printLines(array2);
                }
            }
        }
        printLines(array2);
        return array2;
    }

    private static int[] insertObject(int[] array, int indexofobject, int[] object) {//функиция для вставки определенного объекта
        //на конкретный индекс объекта со сдгивом остальных вправо
        int start = getAdress(array, indexofobject);
        int elements = finStart(array);
        int j = 0;
        if (object.length <= array.length - elements - 1) {//условие для просмотра количества оставщейся памяти в массиве
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

    public static int[] swap(int[] array, int indexofobject1, int indexofobject2) {//функция что меняет местами два объекта
        //в массиве с сохранением их значений
        int start1 = getAdress(array, indexofobject1);
        int start2 = getAdress(array, indexofobject2);
        int difference = array[start1] - array[start2];
        int difference2 = array[start2] - array[start1];
        int common = Math.min(array[start1], array[start2]);
        int j = 1;
        if (array[start1] == array[start2]) {
            for (int i = 0; i < array[start1]; i++) {
                int temp = array[start1];
                array[start1] = array[start2];
                array[start2] = temp;
                start1++;
                start2++;
            }
        } else if (array[start1] > array[start2]) {
            for (int i = 0; i < common + 1; i++) {
                int temp = array[start2];
                array[start2] = array[start1];
                array[start1] = temp;
                start1++;
                start2++;
                printLines(array);
            }
            while (difference >= j) {
                for (int i = start1 + 1; i < start2; i++) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    printLines(array);
                }
                j++;
            }
        } else if (array[start1] < array[start2]) {
            for (int i = 0; i < common + 1; i++) {
                int temp = array[start1];
                array[start1] = array[start2];
                array[start2] = temp;
                start1++;
                start2++;
                printLines(array);
            }
            while (difference2 >= j) {
                for (int i = start2 + difference2 - 1; i > start1; i--) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    printLines(array);
                }
                j++;
            }
        }
        printLines(array);
        return array;
    }

    public static int[] shift(int[] array, int indexofobject1, int indexofobject2) {
        int start1 = getAdress(array, indexofobject1);
        int start2 = getAdress(array, indexofobject2);
        if (array[start1]>array[start2]&&indexofobject1-indexofobject2!=1){
            int difference = array[start1] - array[start2];
            for (int i = start1+array[start1]+1; i <start2 ; i++) {
                array[i-difference]=array[i];
            }

        }else if(array[start1]<array[start2]&&indexofobject1-indexofobject2!=1) {
            int difference = array[start2] - array[start1];
            for (int i =start2-1; i >start1+array[start1]; i--) {
               array[i+difference]= array[i];
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
            System.out.print(String.format(" %2d", lines[i]));
        }
        System.out.println("]");
    }
}