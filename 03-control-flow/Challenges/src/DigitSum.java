public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of 1234 is: " + sumDigits(1234));
        System.out.println("Sum of 789 is: " + sumDigits(789));
    }

    public static int sumDigits(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += number % 10;
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}
