public class StringExcercises {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = "a";
        String str4 = "b";

        System.out.println(str1.equals(str2));  //don't use equal mark to compare
        System.out.println(str1.compareTo(str2)); // if we get 0 it means strings are similar
        System.out.println(str3.compareTo(str4));

    }
}
