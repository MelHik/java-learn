package firstProject.ifElse;

import java.util.Scanner;

public class multipleIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите числa: ");
        int A = scan.nextInt(), B = scan.nextInt();

        System.out.print("Начать проверку чисел? ");
        String pass = scan.nextLine();

/*        if (pass.equals("Да")) {
            System.out.println("Начинаем проверку чисел");
            if (A != B) {
            } else if (A <= B) {
                System.out.println("Число B больше");
            } else if (A >= B) {
                System.out.println("Числа A больше");
            } else {
                System.out.println("Числа равны");
            }
        }*/
    }
}