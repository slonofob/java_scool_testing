package ru.stqa.pft.homebox;

public class CalculationDistance {
    public static void main(String[] args) {

        Point p1 = new Point(1,10);
        Point p2 = new Point(15,20);
        /*
        p1.x = 10.0;
        p1.y = 10.0;
        p2.x = 0;
        p2.y = 0;
        */

        //System.out.println("Растояние между точками" + "(" + p1.x + "," + p1.y + ")" + " и (" + p2.x + "," + p2.y + ") = " + distance(p1, p2));
        //вывод на экран функции

        System.out.println("Растояние между точками" + "(" + p1.x + "," + p1.y + ")" + " и (" + p2.x + "," + p2.y + ") = " + p1.distance(p2));
        //вывод на экран метода
    }

  /*использование функции
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)));
    }
 */
}
