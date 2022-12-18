package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        try (FileWriter writer = new FileWriter("test.txt", false)) {
            String text = sc.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
       
        try (FileReader reader = new FileReader("test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
       
        try (FileWriter writer = new FileWriter("test.txt", false)) {
            String text = sc.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
       
        try (FileWriter writer = new FileWriter("test.txt", true)) {
            String text = sc.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
