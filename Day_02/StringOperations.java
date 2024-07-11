public class StringOperations{   //pascal case
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "John Doe";
        String str3;

        str3 = "Welcome : " + str2;
        System.out.println(str3);

        System.out.println(str3.substring(0,5));

        System.out.println(str2.toUpperCase()); //to get letters in uppercase
    }
}