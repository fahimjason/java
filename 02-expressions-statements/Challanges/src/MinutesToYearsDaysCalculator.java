public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(550332);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / (60 * 24 * 365);
        long yearsRemaining = minutes % (60 * 24 * 365);
        long days = yearsRemaining / (60 * 24);

        System.out.println(minutes + " min " + "= " + years + " y and " + days + " d");
    }
}