package ru.mirea.task4;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Palpatin", "HotWheels69@mail.ru", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a1.setEmail("PalpatinMeta@mail.ru");
        System.out.println(a1);
    }
}
