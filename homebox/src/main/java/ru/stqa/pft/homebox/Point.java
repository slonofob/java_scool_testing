package ru.stqa.pft.homebox;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point to) {
        return Math.sqrt(((this.x - to.x) * (this.x - to.x) + (this.y - to.y) * (this.y - to.y)));
    } //добавление метода
}