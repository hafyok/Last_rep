package com.company;
import java.lang.*;

public class Sorting {

    public static Comparable[] Student = new Comparable[]{12, 45, 2, 87, 23, 16, 22};//Числа для примера
    public static Comparable[] iDNumber = new Comparable[Student.length];

    public static void insertSelec(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;

            iDNumber[index] = list[index];
            System.out.print(list[index] + " ");
        }
    }


}