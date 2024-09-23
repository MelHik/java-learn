package firstProject.ifElse;

import java.util.Scanner;

public class firstLogic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scan.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scan.nextLine();
        if(role.equals("Admin") && pass.equals("123456")) {     // *.equals проверяет переменную * на соответствие
            System.out.println("Вы Admin");
        } else {
            System.out.println("Вы не Admin, кто вы?");
            String name = scan.nextLine();
            System.out.println("Привет, " + name);
        }
    }
}
