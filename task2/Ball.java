package ru.mirea.task2;

public class Ball {
    private String color;
    private int radius;

    public Ball(String c, int r) {
        this.color = c;
        this.radius = r;
    }

    public Ball(String c) {
        this.color = c;
        this.radius = 10;
    }

    public Ball() {
        this.color = "red";
        this.radius = 10;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public String getColor() {
        return this.color;
    }

    public int getRadius() {
        return this.radius;
    }

    public String toString() {
        return "color " + this.color + ", radius " + this.radius;
    }

    public void info() {
        System.out.println("this ball is " + this.color + " and has a radius of " + this.radius);
    }
}
