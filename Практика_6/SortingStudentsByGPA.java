package com.company;

import java.util.Comparator;


public class SortingStudentsByGPA implements Comparator<SortingStudentsByGPA>{

    @Override
    public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
        return 0;
    }

    SortingStudentsByGPA(int t){
        System.out.print(t);
    }
    public static int[] arr = new int[]{10, 9, 6, 4, 7, 3, 2};


    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] > opora) {
                i++;
            }

            while (array[j] < opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void show_sort(int[]list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }


}
