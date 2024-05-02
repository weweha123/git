import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Виберіть операцію: +, -, *, /, quadratic, exit");
            String operation = scanner.nextLine();

            switch (operation) {
                case "+":
                    addition();
                    break;
                case "-":
                    subtraction();
                    break;
                case "*":
                    multiplication();
                    break;
                case "/":
                    division();
                    break;
                case "quadratic":
                    quadraticEquation();
                    break;
                case "exit":
                    scanner.close();
                    System.out.println("До побачення!");
                    System.exit(0);
                default:
                    System.out.println("Невідома операція");
            }
        }
    }

    public static void addition() {
        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Результат: " + result);
        scanner.nextLine(); // очистка буфера
    }

    public static void subtraction() {
        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Результат: " + result);
        scanner.nextLine(); // очистка буфера
    }

    public static void multiplication() {
        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Результат: " + result);
        scanner.nextLine(); // очистка буфера
    }

    public static void division() {
        System.out.println("Введіть ділене:");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть дільник:");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Помилка: Ділення на нуль неможливе");
        } else {
            double result = num1 / num2;
            System.out.println("Результат: " + result);
        }
        scanner.nextLine(); // очистка буфера
    }

    public static void quadraticEquation() {
        System.out.println("Введіть значення a:");
        double a = scanner.nextDouble();
        System.out.println("Введіть значення b:");
        double b = scanner.nextDouble();
        System.out.println("Введіть значення c:");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корінь 1: " + root1);
            System.out.println("Корінь 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Корінь: " + root);
        } else {
            System.out.println("Рівняння не має дійсних коренів");
        }
        scanner.nextLine(); // очистка буфера
    }
}
