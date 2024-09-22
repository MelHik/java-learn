package firstProject;

import java.util.Scanner;

public class math_learn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        short num1 = 50, num2 = 10;
        int res1 = num1 + num2;
        System.out.println("Результат сложения num1 и num2 = " + res1);

        float num3 = 50, num4 = 23;
        float res2 = num3 / num4;
        System.out.println("Результат деления num3 и num4 = " + res2);

        res2 += 10; // равносильно res2 = res2 + 10, работает и для остальных математических операций
        System.out.println("Прибавление к результату 10 = " + res2);

        res2++; // Равносильно res2 = res2 +1; Также можно и вычитать используя res2--
        System.out.println("Прибавление к результату единицы = " + res2);
    }
}
