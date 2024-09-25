package firstProject.switchCase;

import java.util.Scanner;

public class Construction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("Итерация 1");
                break;
            case 2:
                System.out.println("Итерация 2");
                break;
            case 3:
                System.out.println("Итерация 3");
                break;
            case 4:
                System.out.println("Итерация 4");
                break;
            case 5:
                System.out.println("Итерация 5");
                break;
            default:
                System.out.println("Нет такого варианта");
        }
    }
}
