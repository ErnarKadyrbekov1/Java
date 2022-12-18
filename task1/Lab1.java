package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Lab1 {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.print("Введите длину массива: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int array[] = new int[size];

        System.out.print("Введите элементы: ");

        for (int i = 0; i < size; i++)
            array[i] = s.nextInt();

        System.out.print("Сумма: ");

        /**
         * !задание 1
         */

        int sum = 0;
        for (int num : array)
            sum = sum + num;

        System.out.print(sum + " ");

        sum = 0;
        int i = 0;
        while (i < size) {
            sum = sum + array[i];
            i++;
        }

        System.out.print(sum + " ");

        sum = 0;
        i = 0;
        do {
            sum = sum + array[i];
            i++;
        } while (i < size);

        System.out.print(sum + " ");

        System.out.println();

        /**
         * !задание 2
         */

        System.out.print("Аргументы командной строки:");
        for (String str : args)
            System.out.print(str);

        System.out.println();

        /**
         * !задание 3
         */

        System.out.print("Первые 10 чисел гармонического ряда: ");
        for (int j = 1; j < 11; j++) {
            double m = 1. / j;
            System.out.print(m + " ");
        }
        System.out.println();

        /**
         * !задание 4
         */

        int[] arr = new int[10];
        System.out.print("Сгенерированный массив: ");
        for (int l = 0; l < arr.length; l++) {
            arr[l] = r.nextInt(100);
            System.out.print(arr[l] + " ");
        }

        sort(arr);
        System.out.println();
        System.out.print("Отсортированный массив: ");

        for (int l = 0; l < arr.length; l++)
            System.out.print(arr[l] + " ");

        System.out.println();

        /**
         * !задание 5
         */
        System.out.print("Введите число для вычисления факториала: ");
        System.out.print("Результат: " + fact(s));
    }

    private static int fact(Scanner s) {
        int num, res = 1;
        num = s.nextInt();
        for (int t = 1; t <= num; t++)
            res = res * t;
        return res;
    }

}
