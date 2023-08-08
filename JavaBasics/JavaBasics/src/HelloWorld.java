public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        // if-then statement
        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It's not an alien");
        }

        // logical and operator
        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100) ) {
            System.out.println("Greater than second top score and less than 100");
        }

        // logical or operator
        if((topScore > 90) || (secondTopScore < 90)) {
            System.out.println("Either or both the conditions are true");
        }

        // ternary operator
        String makeCar = "Volkswagen";
        boolean isDomestic = makeCar == "Volkswagen" ? false : true;

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
