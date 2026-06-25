# Exercise 01 - Control Structures

## Objective

Use PL/SQL control structures such as cursors, loops, conditional statements, and output statements to solve banking-related business scenarios.

## Problem Statement

The exercise contains three scenarios for a banking system:

1. Apply a loan interest discount for senior customers.
2. Promote high-balance customers to VIP status.
3. Print reminders for loans due within the next 30 days.

## Files

| File | Scenario | Description |
| --- | --- | --- |
| `Scenario-01-LoanInterestDiscount.sql` | Senior customer loan discount | Reduces loan interest rate by `1%` for customers older than 60 |
| `Scenario-02-VIPPromotion.sql` | VIP customer promotion | Marks customers as VIP when their balance is greater than `10000` |
| `Scenario-03-LoanReminder.sql` | Loan due reminder | Displays reminder messages for loans due in the next 30 days |

## Concepts Used

- `DECLARE`, `BEGIN`, `END` PL/SQL block structure
- Explicit cursors
- `FOR` loop cursor iteration
- `IF` conditions
- `UPDATE` statements
- `COMMIT`
- `DBMS_OUTPUT.PUT_LINE`
- Date filtering using `SYSDATE`
- Joining `Customers` and `Loans` tables

## Assumed Tables

The scripts assume that the following tables already exist:

```text
Customers(CustomerID, Name, Age, Balance, IsVIP)
Loans(LoanID, CustomerID, InterestRate, DueDate)
```

## How to Run

Open Oracle SQL Developer or SQL*Plus and enable output:

```sql
SET SERVEROUTPUT ON;
```

Run each script separately:

```sql
@Scenario-01-LoanInterestDiscount.sql
@Scenario-02-VIPPromotion.sql
@Scenario-03-LoanReminder.sql
```

## Expected Behavior

### Scenario 1

Customers older than 60 get a `1%` reduction in loan interest rate.

Expected message:

```text
Loan interest discount applied successfully.
```

### Scenario 2

Customers with balance greater than `10000` are updated as VIP customers.

Expected message:

```text
VIP customers updated successfully.
```

### Scenario 3

For loans due within the next 30 days, reminder messages are printed in this format:

```text
Reminder: Dear <Customer Name>, your Loan ID <Loan ID> is due on <Due Date>
```

## Learning Outcome

This exercise demonstrates how PL/SQL control structures can be used to implement database-side business rules and automate updates based on table data.
