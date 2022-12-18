package ru.mirea.task10;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverse(n, 0));
    }
    public static int reverse(int n, int i) {
        return (n==0) ? i : reverse(n / 10, i * 10 + n % 10);
    }
}
