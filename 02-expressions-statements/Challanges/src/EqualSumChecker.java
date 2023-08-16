public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 3, 9));
    }

    public static boolean hasEqualSum(int one, int two, int three) {

        return (one + two) == three;
    }
}
