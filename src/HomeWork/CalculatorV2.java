package HomeWork;
import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        System.out.println("Калькулятор работает с выражениями + , -, *,/, и возведение в стапень n оператором ^ : \t ");
        System.out.println("Введите выражение : \n ");
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        String op = "";
        do {
            String input = sc.next();
            if (input.equals("Выход")) {
                break;
            }
            String[] strings = input.split("\\W");
            String[] operator = input.split("\\w");
            try {
                a = Integer.parseInt(strings[0]);
                b = Integer.parseInt(strings[1]);
                op = operator[operator.length - 1];
                System.out.println(a + op + b + "=" + operation(a, b, op));
            } catch (Exception e) {
                System.out.println("Ошибка ввода, повторите пожалуйста!");
            }
        } while (true);
    }

    @Contract(pure = true)
    private static double operation(double a, double b, String op) {
        switch (op) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "^":
                return Math.pow(a, b);
            default:
                return 0;
        }
    }
}
