import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1-num2;
        int multiply = num1*num2;
        int divition = num1/num2;
        int modulus = num1%num2;

        System.out.println("Addition of 2 numbers: " + sum);
        System.out.println("Substraction of 2 numbers: " + sub);
        System.out.println("Multiplication of 2 numbers: " + multiply);
        System.out.println("Divition of 2 numbers: " + divition);
        System.out.println("Modulus of 2 numbers: " + modulus);
    }
}