package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("Ryan Gosling", "secret wars", 1900);
        System.out.println(b.getAuthor());
        b.setName("Drive");
        System.out.println(b.getName());
    }
}
