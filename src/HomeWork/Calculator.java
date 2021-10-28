// Написать программу реализующую следующие задачи: сложение; вычитание; умножение; деление; сравнение.
// Программа должна быть реализована с помощью оператора switch
package HomeWork;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        char op;
        double result = 0.0;
        Scanner scanObject = new Scanner(System.in);
        System.out.println(" Введите первое число :");
        a = scanObject.nextInt();
        System.out.println(" Введите оператор :");
        op = scanObject.next() .charAt(0);
        System.out.println(" Введите второе число :");
        b = scanObject.nextInt();
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if ( a < b ) {
            System.out.println(a + " < " + b);
        } else if ( a == b ) {
            System.out.println( " Числа равны ");
        }
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Введено неверное значение оператора");
        }
        System.out.println( a + " " + op + " " + b + " = " + result);
    }
}
