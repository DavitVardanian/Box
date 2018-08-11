package com.javacourse.lesson_6;
                                     //Одним из наиболее
                                     //часто применяемых является алгоритм поиска.
public class ForEach_Search {
    public static void main(String[] args) {
        int nums[] = {6, 4, 9,5, 7, 2, 1, 3};
        int val = 5;
        boolean found = false;       //использовать цикл for в стиле for each для
        for (int x : nums) {         // поиска значения переменной val в массиве նումս
            if (x == val) {
               found = true;
               break;
            }

        }
        if ( found )
                System.out . println ( " Знaчeниe найдено ! " );
    }
}