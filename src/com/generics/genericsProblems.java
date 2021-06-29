package com.generics;
public class genericsProblems <T extends Comparable>{
    private T[] array;

    public genericsProblems(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer[] intArray={5,15,96,53,45,74};
        Double[] doubleArray={5.6,4.2,3.6,8.4,9.4,4.2};
        String[] stringArray={"cat","dog","lion","tiger","elephant","zebra"};
        genericsProblems.getMaximum(intArray);
        genericsProblems.getMaximum(doubleArray);
        genericsProblems.getMaximum(stringArray);
    }
    private static <T extends Comparable> void getMaximum(T[] array){

        T max = array[0];
        for (int i=0;i<array.length; i++){
            if (array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        System.out.println("Maximum : "+max);

    }
}