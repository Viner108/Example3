package org.example;

public class MyFistArrayObjectTest {

    private static void testCreate() {//тест функции objectCreate
        MyFirstClass arr = new MyFirstClass(5);
//        int[] array = arr.intit(5);//создает массив заполненный -1
        int[] object = new int[2]; // первый объект для размещенние в массив с нулевыми значениями
        arr.objectCreate(object); // функция для размещение первого объкта в массиве

        int[] array = arr.getCopyOfArray();
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
}
