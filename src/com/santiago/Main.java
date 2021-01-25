package com.santiago;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;  //  regular variable
        int[] myIntArray;
        myIntArray = new int[50];  //  it is an array composed of 10 elements, of type int. We cant put any value with another type there

        myIntArray[5] = 50; // accessing 6th element in array

        myIntArray[0] = 1;
        myIntArray[1] = 2;   //  one way of adding values
        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10; // another way
        }
        int[] myIntArrayTWO = {1,2,4,5,6,7,8,9,10}; //  another way to add values, works only while initialising!

        double[] myDoubleArray = new double[10];  // another way to create array
        System.out.println(myIntArray[5]);

        printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }

        }
}
