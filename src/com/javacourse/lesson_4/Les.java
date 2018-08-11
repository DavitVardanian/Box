package com.javacourse.lesson_4;

public class Les {
    public static void main(String[] args) {
        byte  a1 = 10;             // Автоматическое продвижение типов в выражениях
        byte  b1 = 100;
        byte  c1 = 100;
        int   d1 = a1*b1/c1;
        System.out.println("число "+d1);
    }
}
