package com.hellosrijan;

import java.util.stream.IntStream;

public class MainCalculator {

    public void additionBug() {

        // Generate array of float numbers
        double value = 0.12;
        double[] numbers = IntStream.range(0, 10).mapToDouble(i -> value).toArray();

        // General Calculation addition.
        GeneralCalculator gc = new GeneralCalculator();
        double result = gc.addition(numbers);

        System.out.println("Result after addition of double value " + value + " up to 10 times is " + result);
        // Output : Result after addition of double value 0.12 10 times :1.2000000000000002
        // You will clearly see that the result is ending with the 2 which is a bug.

        //BugFix
        System.out.println("Time to fix this bug!");
        CurrencyCalculator cc = new CurrencyCalculator();
        double currencyAddition = cc.addition(numbers);
        System.out.println("Result after addition of double value " + value + " up to 10 times is " + currencyAddition);

    }
}
