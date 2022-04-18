package com.company;

public class ALOHA {
    public static void main(String[] args) {
        System.out.println("Задача: дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов данного массива.");
        System.out.print("Решение:");
        int[] number = {2, 3, 4, 5};
            int multiplication = 1;
            for (int x:number) {
                multiplication = multiplication * x;

            }
        System.out.println(multiplication);
        System.out.println("Работу выполнил Варсанохов Артём");
        }
    }