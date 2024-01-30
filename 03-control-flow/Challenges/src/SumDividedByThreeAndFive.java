public class SumDividedByThreeAndFive {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int num = 1; count < 5 && num <= 1000; num++) {
            if(num % 15 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }
        }

        System.out.println(sum);
    }
}

