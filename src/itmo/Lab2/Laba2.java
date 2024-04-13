package itmo.Lab2;

import java.util.Calendar;

public class Laba2
{
    public static void main(String[] args)
    {
        /** Лаба 2. Упражнение 1. Прилагается класс "Calculator". */

        int a = 10;
        int b = 6;

        int RezSumInt = Calculator.Sum(a, b);
        int RezSubstractInt = Calculator.Substruct(a, b);
        int RezMultiplyInt = Calculator.Multiply(a, b);
        double RezDivideInt = Calculator.Divide(a, b);

        System.out.println("RezSumInt = " + a + " + " + b + " = " + RezSumInt);
        System.out.println("RezSubstractInt = " + a + " - " + b + " = " + RezSubstractInt);
        System.out.println("RezMultiplyInt = " + a + " * " + b + " = " + RezMultiplyInt);
        System.out.println("RezDivideInt = " + a + " / " + b + " = " + RezDivideInt);
        System.out.println("");

        long a2 = 25;
        long b2 = 7;

        long RezSumLong = Calculator.Sum(a2, b2);
        long RezSubstractLong = Calculator.Substruct(a2, b2);
        long RezMultiplyLong = Calculator.Multiply(a2, b2);
        double RezDivideLong = Calculator.Divide(a2, b2);

        System.out.println("RezSumLong = " + a2 + " + " + b2 + " = " + RezSumLong);
        System.out.println("RezSubstractLong = " + a2 + " - " + b2 + " = " + RezSubstractLong);
        System.out.println("RezMultiplyLong = " + a2 + " * " + b2 + " = " + RezMultiplyLong);
        System.out.println("RezDivideLong = " + a2 + " / " + b2 + " = " + RezDivideLong);
        System.out.println("");

        double a3 = 37.54;
        double b3 = 15.7;

        double RezSumDouble = Calculator.Sum(a3, b3);
        double RezSubstractDouble = Calculator.Substruct(a3, b3);
        double RezMultiplyDouble = Calculator.Multiply(a3, b3);
        double RezDivideDouble = Calculator.Divide(a3, b3);

        System.out.println("RezSumDouble = " + a3 + " + " + b3 + " = " + RezSumDouble);
        System.out.println("RezSubstractDouble = " + a3 + " - " + b3 + " = " + RezSubstractDouble);
        System.out.println("RezMultiplyDouble = " + a3 + " * " + b3 + " = " + RezMultiplyDouble);
        System.out.println("RezDivideDouble = " + a3 + " / " + b3 + " = " + RezDivideDouble);
        System.out.println("");


        /** Лаба 2. Упражнение 2. Прилагается класс "Person". */

        Person person1 = new Person("Иванов", "Иван", "Иванович", 30, "+7-495-123-45-67");
        Person person2 = new Person("Петров", "Пётр", 20);
        Person person3 = new Person("Васильев", "Василий");
        Person person4 = new Person();

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
        person4.printInfo();
    }
}
