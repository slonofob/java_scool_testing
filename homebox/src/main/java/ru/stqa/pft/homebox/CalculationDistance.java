package ru.stqa.pft.homebox;

public class CalculationDistance {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
        //создание объекта
        p1.x = 10.0;
        p1.y = 10.0;
        p2.x = 0;
        p2.y = 0;
        //заведение переменных

        System.out.println("Растояние между точками" + "(" + p1.x + "," + p1.y + ")" + " и (" + p2.x + "," + p2.y + ") = " + distance(p1, p2));
        //вывод на экран
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)));
//создание функции с вычислением расстояния
    }
}
