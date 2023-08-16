public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(3, 13, 90));
        System.out.println(isTeen(3));
    }

    public static boolean hasTeen(int one, int two, int three) {

        return one >= 13 && one <= 19 || two >= 13 && two <= 19 || three >= 13 && three <= 19;
    }

    public static boolean isTeen(int number) {

        return number >= 13 && number <= 19;
    }
}
