package first.project;

import java.util.Scanner;

public class inputFromUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, " + username);

        System.out.print("Введи свой возраст: ");
        int age = scan.nextInt();
        System.out.print("Тебе " + age + " лет");

    }
}
