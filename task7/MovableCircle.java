package ru.mirea.task7;

public class MovableCircle implements Movable {
    MovablePoint CircleCenter;
    int Radius;

    public MovableCircle(MovablePoint circleCenter, int radius) {
        CircleCenter = circleCenter;
        Radius = radius;
    }

    @Override
    public void MoveLeft() {
        CircleCenter.x_Position -= CircleCenter.x_Moving;
    }

    @Override
    public void MoveRight() {
        CircleCenter.x_Position += CircleCenter.x_Moving;
    }

    @Override
    public void MoveUp() {
        CircleCenter.y_Position += CircleCenter.y_Moving;
    }

    @Override
    public void MoveDown() {
        CircleCenter.y_Position -= CircleCenter.y_Moving;
    }

    @Override
  
    public String toString() {
        return "MovablePoint { x = " + CircleCenter.x_Position +
                ", y = " + CircleCenter.y_Position + " }";
    }
}
