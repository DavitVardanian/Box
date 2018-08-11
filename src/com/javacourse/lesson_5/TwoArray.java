package com.javacourse.lesson_5;

public class TwoArray {
    public static void main(String[] args) { // В этой программе вычисляется среднее значение ряда чисел
//        double nums []={10.1,11.2,12.3,13.4,14.5};
//        double result = 0;
//        int i;
//        for (i=0;i<5;i++)
//            result =result=nums[i];
//        System.out.println("среднее значение равно "+result/5);

        int froHro [][]=new int[4][5];
        int i,j,k = 0;
        for (i=0;i<4;i++)
            for (j=0;j<5;j++){
            froHro[i][j]=k;
            k++;
        }
        for (i=0;i<4;i++){
            for (j=0;j<5;j++)
                System.out.print(froHro[i][j]+" ");
            System.out.println();
        }

    }
}
