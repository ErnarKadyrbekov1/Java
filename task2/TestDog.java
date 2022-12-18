package ru.mirea.task2;

public class TestDog {
    public TestDog() {
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("1", 2);
        Dog d2 = new Dog("2", 7);
        Dog d3 = new Dog("3");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}