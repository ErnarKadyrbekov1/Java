package ru.mirea.task10;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) { odd(); }

    public static void odd(){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char[] chars = n.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if(ch == '0' &&  i  == n.length() - 1) break;
            if(i % 2 == 0) System.out.print(ch);
        }
    }
}
