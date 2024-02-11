public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        int i = number;

        while (i != 0){
            reverseNumber = (reverseNumber * 10) + i % 10;
            i = i / 10;
        }
        return reverseNumber == number;
    }


/*
Instead of a while loop where i is defined in one line,
and the condition to iterate in another, and what to increment in a third line,
use a for loop for conciseness.

    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        // int i = number;
        // while (i != 0){
        for (int i = number; i != 0; i /= 10){
            reverseNumber = reverseNumber*10 + i%10;
            // i /= 10;
        }
        return reverseNumber == number;
    }
    */
}
