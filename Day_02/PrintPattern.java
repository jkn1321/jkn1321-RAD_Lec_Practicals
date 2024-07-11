import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("This is an even number. Please Enter an odd number....");
        }else{
            for (int row = 0; row < n; row++){
                for (int column = 0; column < n; column++){
                    if(row == column) {
                        System.out.print("X ");
                    }else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
