import java.util.Scanner;

public class PrintPattern2 {
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
                    } else if (column == n - row - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("* ");
                    }
                }
            System.out.println();
            }
        }
    }
}
