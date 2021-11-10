package com.company;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //Сортировка вставкой
      Sorting a = null;
      a.insertSelec(a.Student);

        //Быстрая сортировка
        SortingStudentsByGPA sor = null;
      int[] arr = new int[]{10, 9, 6, 4, 7, 3, 2};
      sor.quickSort(arr, 0, arr.length - 1);
      sor.show_sort(arr);

    }
}
