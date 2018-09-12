package ru.stqa.pft.homebox;

import java.sql.SQLOutput;

class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Aleksander");

        Square s = new Square(5);


        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(10, 10);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello  " + somebody + "!");
    }

    /** перенесли в метод
     public static double area(Square s) {
     return s.l * s.l;
     }


     public  static double area (Rectangle r){
     return r.a*r.b;
     }
     */
}