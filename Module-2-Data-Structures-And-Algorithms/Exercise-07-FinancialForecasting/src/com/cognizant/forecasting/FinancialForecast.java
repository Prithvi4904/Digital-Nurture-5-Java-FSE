package com.cognizant.forecasting;

public class FinancialForecast {

    public static double predictFutureValue(
            double currentValue,
            double growthRate,
            int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(
                currentValue,
                growthRate,
                years - 1)
                * (1 + growthRate);
    }
}