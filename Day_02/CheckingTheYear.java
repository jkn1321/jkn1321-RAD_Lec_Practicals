import java.util.Scanner;

public class CheckingTheYear {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");

        int year = sc.nextInt();

        boolean isLeap =false;  //reconsider the steps

        if (year % 400 ==0){
            isLeap = true;
        }else if (year % 100 != 0){

        } else if (year % 4 == 0) {
            isLeap = true;
        }else{

        }

        System.out.println("Given year is a leap year: " + isLeap);
    }
}
