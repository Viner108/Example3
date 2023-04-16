package org.example;

public class MyFirstClass {
    private int a;
    private int b;

    private int size = 0;
    int[] array;

    public int[] getCopyOfArray() {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }
        return res;
    }

    public MyFirstClass(int n) {
        this.array = intit(n);
    }

    public MyFirstClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int[] intit(int size) { // функция для создания и заполнения исходного массива
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        return array;
    }

    public boolean objectCreate(int[] object) { // функция для размещения объекта в массиве
        int start = finStart(array);
        if (array.length - start < object.length + 1) {
            return false;
        }
        array[start] = object.length;
        for (int i = 0; i < object.length; i++) {
            array[start + i + 1] = object[i];
        }
        size++;
        return true;
    }

    public int getSize() {
        return size;
    }

    private int finStart(int[] array) { // функция для подсчета количества элементов в предыдущем объекте
        int i = 0;
        while (array[i] != -1) {
            i++;
        }
        return i;
    }
    public MyFirstClass(MyFirstClass  m) {
        this.a = m.getA();
        this.b = m.getB();
    }

    public MyFirstClass(long b33, int a12) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
