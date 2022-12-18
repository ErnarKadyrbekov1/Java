package ru.mirea.task8;

import javax.swing.*;

public class Test3 extends Animation{
    public static void main(String[] args) {
        String path = "C:\\Users\\maks\\Desktop\\DZ\\task8\\img\\";
        new Animation();
        int length = 10;

        for(int i = 1; i <= length; i++) framelist.add(new ImageIcon(path + (i < 10 ? "00" : (i < 100 ? "0" : "")) + i + "-dinosaur.png").getImage());
        Animation a1 = new Animation();
        while (true) {
            for (int i = 0; i < length; i++) {
                image = framelist.get(i);
                a1.repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
