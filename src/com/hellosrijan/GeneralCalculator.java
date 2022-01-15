package com.hellosrijan;

public class GeneralCalculator implements Calculator {
    @Override
    public double addition(double[] numbers) {
        double result = 0;
        // Loop to add all the numbers and store in result.
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiplication(double[] numbers) {
        double result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        try {
            return firstNumber / secondNumber;
        } catch (ArithmeticException exception) {
            System.out.println("Divide by Zero is not possible.");
            return 0;
        }
    }
}
