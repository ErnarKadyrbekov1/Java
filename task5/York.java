package ru.mirea.task5;

public class York extends Dog {
    public York(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Dachshund:" + " name" + this.getName() + ", age " + this.getAge();
    }
}
