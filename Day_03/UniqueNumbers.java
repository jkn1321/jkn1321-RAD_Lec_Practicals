import java.util.Scanner;
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        int num = 0;
        int numValues = 0;
        Boolean valid = true; 

    while(numValues < numbers.length){
        do{
            valid = true;
            System.out.print("Please enter a unique number: ");
            num = in.nextInt();

            for(int i = 0; i < numValues; i++){
                if(num == numbers[i]){
                    System.out.println("Number already exists");
                    valid = false;
                    break;
                }
            }
        }while(!valid);
        numbers[numValues] =num;
        numValues++;
    }
    in.close();

    for(int numV : numbers){
        System.out.print(numV + " ");
    }
    }
}