package org.example;

public class MemoryArrayTest {
    public static void testCreate() {//тест функции objectCreate
        MemoryArray ob = new MemoryArray(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        ob.objectCreate(object); // функция для размещение первого объкта в массиве
        int[] array = ob.getArray();
        ob.printLines(array);
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

    public static void testUpdate() {//тест функции update
        MemoryArray ob = new MemoryArray(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        ob.objectCreate(object); // функция для размещение первого объкта в массиве
        int indexofobject = 0; // индекс объекта
        int value = 131;// значение для внесения его в объект
        int index = 1;// индекс значение в объкте
        ob.update(index, indexofobject, value); //функция для замены значения в определенной объекте
        int[] array = ob.getArray();
        ob.printLines(array);
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

    //
    public static void testGetByIndex() {//тест функции getByIndex
        MemoryArray ob = new MemoryArray(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        ob.objectCreate(object); // функция для размещение первого объкта в массиве
        int indexofobject = 0; // индекс
        int[] array2 = ob.getByIndex(indexofobject);
        ob.printLines(array2);
        if (!(array2[0] == 0 &&
                array2[1] == 0)) {
            System.out.println("error testGetByIndex");
        } else {
            System.out.println("correct testGetByIndex");
        }
    }

    //
    public static void testDeleteObject() {//тест функции deleteObject
        MemoryArray ob = new MemoryArray(6);//создает массив заполненный -1
        int[] object = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object1 = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        ob.objectCreate(object); // функция для размещение первого объкта в массиве
        ob.objectCreate(object1); // функция для размещение первого объкта в массиве
        int indexofobject = 1; // индекс объекта
        int[] array2 = ob.deleteObject(indexofobject);
        ob.printLines(array2);
        ;
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

    //
    public static void testDeleteFromMiddle() {//тест функции deleteFromMiddle
        MemoryArray ob = new MemoryArray(9);//создает массив заполненный -1
        int[] object = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[2];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[3];// третий объект для размещенние в массив с нулевыми значениями
        ob.objectCreate(object); // функция для размещение первого объкта в массиве
        ob.objectCreate(object2);// функция для размещение второго объкта в массиве
        ob.objectCreate(object3);// функция для размещение третьего объкта в массиве
        int indexofobject = 0; // индекс объекта
        int[] array2 = ob.deleteFromMiddle(indexofobject);
        ob.printLines(array2);
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

    //
    public static void testInsertObject() {//тест функции insertObject
        MemoryArray ob = new MemoryArray(9);//создает массив заполненный -1
        int[] object = new int[1]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[1];// третий объект для размещенние в массив с нулевыми значениями
        int[] object4 = new int[2];// третий объект для размещенние в массив с нулевыми значениями
        ob.objectCreate(object); // функция для размещение первого объкта в массиве
        ob.objectCreate(object2);// функция для размещение второго объкта в массиве
        ob.objectCreate(object3);// функция для размещение третьего объкта в массиве
        int indexofobject = 2; // индекс объекта
        int[] array2 = ob.insertObject(indexofobject, object4);
        ob.printLines(array2);
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

    //
    public static void testSwap() {//тест функции swap
        MemoryArray ob = new MemoryArray(11);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        object[0] = 131;
        object[1] = 10;
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[4];// третий объект для размещенние в массив с нулевыми значениями
        object3[0] = 12;
        object3[2] = 20;
        ob.objectCreate(object); // функция для размещение первого объкта в массиве
        ob.objectCreate(object2);// функция для размещение второго объкта в массиве
        ob.objectCreate(object3);// функция для размещение третьего объкта в массиве
        int indexofobject1 = 0;
        int indexofobject2 = 2;
        int[] array2 = ob.swap(indexofobject1, indexofobject2);
        ob.printLines(array2);
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

    public static void testShift() {//тест функции swap
        MemoryArray ob = new MemoryArray(11);//создает массив заполненный -1
        int[] object = new int[4]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[3];// третий объект для размещенние в массив с нулевыми значениями
        ob.objectCreate( object); // функция для размещение первого объкта в массиве
        ob.objectCreate( object2);// функция для размещение второго объкта в массиве
        ob.objectCreate( object3);// функция для размещение третьего объкта в массиве
        int indexofobject1 = 0;
        int indexofobject2 = 2;
        int[] array2 = ob.shift( indexofobject1, indexofobject2);
         ob.printLines(array2);
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

    public static void testSwap2() {//тест функции swap
        MemoryArray ob = new MemoryArray(12);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        object[0] = 12;
        object[1] = 22;
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        object2[0] = 8;
        int[] object3 = new int[6];// третий объект для размещенние в массив с нулевыми значениями
        object3[0] = 302;
        object3[2] = 27;
        ob.objectCreate( object); // функция для размещение первого объкта в массиве
        ob.objectCreate( object2);// функция для размещение второго объкта в массиве
        ob.objectCreate( object3);// функция для размещение третьего объкта в массиве
        int indexofobject1 = 2;
        int indexofobject2 = 0;
        int[] array2 = ob.swap2( indexofobject1, indexofobject2);
//      ob.printLines(array2);
        if (!(array2[0] == 6 &&
                array2[1] == 0 &&
                array2[2] == 0 &&
                array2[3] == 0 &&
                array2[4] == 0 &&
                array2[5] == 0 &&
                array2[6] == 0 &&
                array2[7] == 1 &&
                array2[8] == 0 &&
                array2[9] == 2 &&
                array2[10] == 0 &&
                array2[11] == 0)) {
            System.out.println("error testSwap2");
        } else {
            System.out.println("correct testSwap2");
        }
    }

    public static void testArrayAdress() {//тест функции swap
        MemoryArray ob = new MemoryArray(12);//создает массив заполненный -1
        int[] object = new int[3]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[2];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[1];// третий объект для размещенние в массив с нулевыми значениями
        ob.objectCreate( object); // функция для размещение первого объкта в массиве
        ob.objectCreate( object2);// функция для размещение второго объкта в массиве
        ob.objectCreate( object3);// функция для размещение третьего объкта в массиве
        int[] array2 = ob.arrayAdress();
      ob.printLines(array2);
        if (!(array2[0] == 3 &&
                array2[1] == 2 &&
                array2[2] == 1)) {
            System.out.println("error testArrayAdress");
        } else {
            System.out.println("correct testArrayAdress");
        }
    }

    public static void testSorting() {//тест функции swap
        MemoryArray ob = new MemoryArray(12);//создает массив заполненный -1
        int[] object = new int[3]; // первый объект для размещенние в массив с нулевыми значениями
        int[] object2 = new int[1];// второй объект для размещенние в массив с нулевыми значениями
        int[] object3 = new int[2];// третий объект для размещенние в массив с нулевыми значениями
        ob.objectCreate( object); // функция для размещение первого объкта в массиве
        ob.objectCreate( object2);// функция для размещение второго объкта в массиве
        ob.objectCreate( object3);// функция для размещение третьего объкта в массиве
        int[] array2 = ob.sorting();
      ob.printLines(array2);
        if (!(array2[0] == 1 &&
                array2[1] == 0 &&
                array2[2] == 2 &&
                array2[3] == 0 &&
                array2[4] == 0 &&
                array2[5] == 3 &&
                array2[6] == 0 &&
                array2[7] == 0 &&
                array2[8] == 0 &&
                array2[9] == -1 &&
                array2[10] == -1 &&
                array2[11] == -1)) {
            System.out.println("error testSorting");
        } else {
            System.out.println("correct testSorting");
        }
    }

    public static void testSorting2() {//тест функции swap
        MemoryArray ob = new MemoryArray(35);//создает массив заполненный -1
        int[] object1 = new int[3]; // первый объект для размещенние в массив с нулевыми значениями
        object1[1] = 1;
        object1[2] = 2;
        int[] object2 = new int[8];// второй объект для размещенние в массив с нулевыми значениями
        object2[1] = 11;
        object2[4] = 11;
        int[] object3 = new int[5];// второй объект для размещенние в массив с нулевыми значениями
        object3[1] = 33;
        object3[2] = 33;
        int[] object4 = new int[7];// второй объект для размещенние в массив с нулевыми значениями
        object4[1] = 77;
        object4[5] = 77;
        int[] object5 = new int[2];// второй объект для размещенние в массив с нулевыми значениями
        int[] object6 = new int[4];// третий объект для размещенние в массив с нулевыми значениями
        ob.objectCreate( object1); // функция для размещение первого объкта в массиве
        ob.objectCreate( object2);// функция для размещение второго объкта в массиве
        ob.objectCreate( object3);// функция для размещение второго объкта в массиве
        ob.objectCreate(object4);// функция для размещение третьего объкта в массиве
        ob.objectCreate( object5);// функция для размещение третьего объкта в массиве
        ob.objectCreate( object6);// функция для размещение третьего объкта в массиве
        int[] array2 = ob.sorting();
      ob.printLines(array2);
        if (!(array2[0] == 2 &&
                array2[1] == 0 &&
                array2[2] == 0 &&
                array2[3] == 3 &&
                array2[4] == 0 &&
                array2[5] == 1 &&
                array2[6] == 2 &&
                array2[7] == 4 &&
                array2[8] == 0 &&
                array2[9] == 0 &&
                array2[10] == 0 &&
                array2[11] == 0 &&
                array2[12] == 5 &&
                array2[13] == 0 &&
                array2[14] == 33 &&
                array2[15] == 33 &&
                array2[16] == 0 &&
                array2[17] == 0 &&
                array2[18] == 7 &&
                array2[19] == 0 &&
                array2[20] == 77 &&
                array2[21] == 0 &&
                array2[22] == 0 &&
                array2[23] == 0 &&
                array2[24] == 77 &&
                array2[25] == 0 &&
                array2[26] == 8 &&
                array2[27] == 0 &&
                array2[28] == 11 &&
                array2[29] == 0 &&
                array2[30] == 0 &&
                array2[31] == 11 &&
                array2[32] == 0 &&
                array2[33] == 0 &&
                array2[34] == 0)) {
            System.out.println("error testSorting");
        } else {
            System.out.println("correct testSorting");
        }
    }
}
