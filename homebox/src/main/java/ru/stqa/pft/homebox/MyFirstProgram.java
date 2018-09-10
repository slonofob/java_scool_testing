package ru.stqa.pft.homebox;

import java.sql.SQLOutput;

class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Aleksander");

        Square s = new Square();
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle();
        r.b = 10;
        r.a = 5;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }

    public static void hello(String somebody) {
        System.out.println("Hello  " + somebody + "!");
    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }
}