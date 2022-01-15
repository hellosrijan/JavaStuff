package com.hellosrijan;

import java.math.BigDecimal;

public class CurrencyCalculator extends GeneralCalculator implements Calculator {

    @Override
    public double addition(double[] numbers) {
        BigDecimal total = new BigDecimal(0);
        for (double number : numbers) total = total.add(BigDecimal.valueOf(number));
        return total.doubleValue();
    }
}
