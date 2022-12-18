package ru.mirea.task10;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        boolean flag = false;
        char[] chars = String.valueOf(n).toCharArray();
        for(char letter : chars) {
            if(letter == '0' && flag) break;
            else if(letter == '0') flag = true;
            else flag = false;
            if(letter == '1') count++;
        }

        System.out.println(count);
    }


}
