package org.example;

public class MemoryArray {
    int[] array;

    public int[] getArray() {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public MemoryArray(int size) {
        this.array = intit(size);
    }

    public int[] intit(int size) { // функция для создания и заполнения исходного массива
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        return array;
    }

    public boolean objectCreate(int[] object) { // функция для размещения объекта в массиве
        int start = finStart();
        if (array.length - start < object.length + 1) {
            return false;
        }
        array[start] = object.length;
        for (int i = 0; i < object.length; i++) {
            array[start + i + 1] = object[i];
        }
        return true;
    }

    public int finStart() { // функция для подсчета количества элементов в предыдущем объекте
        int i = 0;
        while (this.array[i] != -1) {
            i++;
        }
        return i;
    }


        public  boolean update(int index, int indexofobject, int value) {//функиця для замены значения в
        //оперделенной объекте
        int start = getAdress( indexofobject);
        if (start != -1 && index < array[start]) {
            array[start + index + 1] = value;
            return true;
        }
        return false;
    }

    public  int getCount() {//функция считает количество объектов в массиве
        int j = -1;
        int i = 0;
        while (i < array.length && array[i] != -1) {
            i = i + array[i] + 1;
            j++;
        }
        return j;
    }

    public  int getAdress( int indexofobject) {//функция возвращающая индекс начала определенного объекта
        int j = -1;
        int count = getCount();
        for (int i = 0; array[i] != -1; i = i + array[i] + 1) {
            j++;
            if (j == indexofobject && j <= count) {
                return i;
            }
        }
        return -1;
    }
//
    public  int[] getByIndex( int indexofobject) {//функция выводит на консоль конкретный объект
        int start = getAdress( indexofobject);
        int[] error = new int[0];
        if (start != -1) {
            int[] array2 = new int[array[start]];
            for (int i = start + 1; i < start + array[start] + 1; i++) {
                array2[i - start - 1] = array[i];
            }
            return array2;
        }
        return error;//если объекта под конкретным номером нет, то на консоль выводится пустой массив
    }

    public  int[] deleteObject( int indexofobject) {//функция удаления конкретного объекта
        int start = getAdress( indexofobject);
        int[] array2 = getByIndex( indexofobject);
        if (start != -1) {
            for (int i = start; i < start + array2.length + 1; i++) {
                array[i] = -1;
            }
        }
        return array;
    }
//
    public  int[] deleteFromMiddle( int indexofobject) {//функция удаляет определенный объект
        // и сдвигает оставщиеся в левую сторону
        int start = getAdress( indexofobject);
        int lenght = array[start];
        int count = getCount();
        int[] array2 = deleteObject( indexofobject);
        while (array2[start] == -1 && count != indexofobject) {
            for (int i = start; i < array.length; i++) {
                if (array2[i] != -1) {
                    int temp = array2[i];
                    array2[i] = array2[i - 1];
                    array2[i - 1] = temp;
                }
            }
        }
        return array2;
    }

    public int[] insertObject( int indexofobject, int[] object) {//функиция для вставки определенного объекта
        //на конкретный индекс объекта со сдгивом остальных вправо
        int start = getAdress( indexofobject);
        int elements = finStart();
        int j = 0;
        if (object.length <= array.length - elements - 1) {//условие для просмотра количества оставщейся памяти в массиве
            while (array[start] != -1 || j != object.length + 1) {
                for (int i = array.length - 1; i > start; i--) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
                j++;
            }
            array[start] = object.length;
            for (int i = 0; i < object.length; i++) {
                array[start + i + 1] = object[i];

            }
        }
        return array;
    }

    public int[] swap( int indexofobject1, int indexofobject2) {//функция что меняет местами два объекта
        //в массиве с сохранением их значений
        int start1 = getAdress( indexofobject1);
        int start2 = getAdress( indexofobject2);
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
            }
            while (difference >= j) {
                for (int i = start1 + 1; i < start2; i++) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
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
            }
            while (difference2 >= j) {
                for (int i = start2 + difference2 - 1; i > start1; i--) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
                j++;
            }
        }
        return array;
    }

    public int[] shift( int indexofobject1, int indexofobject2) {//функция смещения элементов объектов
        int start1 = getAdress( indexofobject1);
        int start2 = getAdress( indexofobject2);
        if (array[start1] > array[start2] && indexofobject1 - indexofobject2 != 1) {
            int difference = array[start1] - array[start2];
            for (int i = start1 + array[start1] + 1; i < start2; i++) {
                array[i - difference] = array[i];
            }

        } else if (array[start1] < array[start2] && indexofobject1 - indexofobject2 != 1) {
            int difference = array[start2] - array[start1];
            for (int i = start2 - 1; i > start1 + array[start1]; i--) {
                array[i + difference] = array[i];
            }
        }
        return array;
    }

    public int[] copy( int indexofobject1, int[] object) {//функция для вставки объекта в нужное место
        int start = findStart( indexofobject1);
        array[start] = object.length;
        for (int i = start; i < start + object.length; i++) {
            array[i + 1] = object[i - start];
        }
        return array;
    }

    public int findStart( int indexofobject1) {//функция для поиска начала вставки объекта
        int j = 0;
        int i = 0;
        while (indexofobject1 != j) {
            j++;
            i = i + array[i] + 1;
        }
        return i;
    }

    public int[] swap2( int indexofobject1, int indexofobject2) {//функция что меняет местами два объекта
        //в массиве с сохранением их значений
        if (indexofobject1 >= indexofobject2) {
            int temp = indexofobject1;
            indexofobject1 = indexofobject2;
            indexofobject2 = temp;
        }
        int[] object1 = getByIndex( indexofobject1);
        printLines(object1);
        int[] object2 = getByIndex( indexofobject2);
        int[] array2 = shift( indexofobject1, indexofobject2);
        int[] array3 = copy( indexofobject1, object2);
        int[] array4 = copy( indexofobject2, object1);
        return array;
    }

    public int[] arrayAdress() {// массив с длинами объектов на месте значений
        int size = getCount();
        int[] adress = new int[size + 1];
        int j = 0;
        for (int i = 0; i < array.length&&array[i]!=-1; i = i + array[i] + 1) {
            adress[j] = array[i];
            j++;
        }
        return adress;
    }

    public int[] sorting() {// фукнция сортировки объектов по их длинне от меньшего к большему
        int[] adress = arrayAdress();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < adress.length; i++) {
                if (adress[i] < adress[i - 1]) {
                    array = swap2( i-1, i);
                    int temp = adress[i];
                    adress[i] = adress[i - 1];
                    adress[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }
//
    public static void printLines(int[] array) {//функция для выведения массива на консоль
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(String.format(" %2d", array[i]));
        }
        System.out.println("]");
    }
}

