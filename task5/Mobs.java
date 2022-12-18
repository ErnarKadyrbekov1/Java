package ru.mirea.task5;

public class Mobs extends Dog {
    public Mobs(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Dalmatian:" + " name" + this.getName() + ", age " + this.getAge();
    }
}
