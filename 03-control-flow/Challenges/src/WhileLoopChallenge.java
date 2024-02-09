public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 5;
        int endNumber = 20;
        int totalOdd = 0;
        int totalEven = 0;

        while (number <= endNumber){
            if(isEvenNumber(number)) {
                totalEven++;
                System.out.println(number);
            }

            totalOdd++;
            number++;

            if(totalEven >= 5) {
                break;
            }
            continue;
        }

        System.out.println("Total odd: " + totalOdd + " and total even: " + totalEven);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
