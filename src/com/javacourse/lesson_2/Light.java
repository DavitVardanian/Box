package com.javacourse.lesson_2;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;   //78 ej//
        days = 1000;
        seconds = days * 24*60*60;
        distance = lightSpeed * seconds;
        System.out.println();
        System.out.print( " за "+ days);
        System.out.print(" днеи свет проидет около ");
        System.out.println(distance + " миль. " );

    }
}
