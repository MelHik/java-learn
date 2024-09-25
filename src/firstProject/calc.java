package firstProject;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float a = scan.nextFloat();

        System.out.print("Введите второе число: ");
        float b = scan.nextFloat();

        System.out.print("Действие: ");
        String action = scan.nextLine();
        action = scan.nextLine();

        float res;

        switch (action) {
            case "+":
                res = a + b;
                System.out.print("Результат = " + res);
                break;
            case  "-":
                res = a - b;
                System.out.print("Результат = " + res);
                break;
            case  "/":
                if(b == 0)
                    System.out.print("Деление на ноль");
                else {
                res = a / b;
                System.out.print("Результат = " + res);
            }
                break;
            case  "*":
                res = a * b;
                System.out.print("Результат = " + res);
                break;
            default:
                System.out.print("Нет такого действия");
        }
    }
}
