package firstProject;

import java.util.Scanner;

public class primitiveCalc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = scan.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        float res5 = num1 % num2;

        System.out.println("Result:\n" + res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5);
    }
}
