# Exercise 07 - Financial Forecasting

## Objective

Use recursion to predict the future value of an investment based on an initial amount, growth rate, and number of years.

## Problem Statement

Financial forecasting often requires estimating how a value grows over time. This exercise applies a recursive approach to calculate compound growth for a fixed annual growth rate.

## Implementation Details

| File | Responsibility |
| --- | --- |
| `FinancialForecast.java` | Contains the recursive method for calculating future value |
| `ForecastTest.java` | Driver class that provides sample input and prints the predicted result |

## Approach

The method `predictFutureValue(currentValue, growthRate, years)` works as follows:

- Base case: if `years == 0`, return the current value.
- Recursive case: calculate the value for `years - 1`, then multiply it by `1 + growthRate`.

Formula represented recursively:

```text
Future Value = Current Value * (1 + Growth Rate) ^ Years
```

## Complexity Analysis

- Time complexity: `O(n)`, where `n` is the number of years.
- Space complexity: `O(n)` because each recursive call is stored on the call stack.

## How to Run

Run these commands from the repository root:

```powershell
javac -d Module-2-Data-Structures-And-Algorithms/Exercise-07-FinancialForecasting/out Module-2-Data-Structures-And-Algorithms/Exercise-07-FinancialForecasting/src/com/cognizant/forecasting/*.java
```

```powershell
java -cp Module-2-Data-Structures-And-Algorithms/Exercise-07-FinancialForecasting/out com.cognizant.forecasting.ForecastTest
```

## Expected Output

For the sample values `currentValue = 10000`, `growthRate = 10%`, and `years = 5`, the predicted value is:

```text
Current Value : Rs.10000.0
Growth Rate : 10.0%
Years : 5
Predicted Future Value : Rs.16105.10
```

## Learning Outcome

This exercise demonstrates recursive problem solving, base and recursive cases, and how recursion can model repeated compound growth calculations.
