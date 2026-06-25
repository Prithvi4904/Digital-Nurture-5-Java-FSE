# Exercise 03 - Stored Procedures

## Objective

Create reusable PL/SQL stored procedures for common banking and employee-management operations.

## Problem Statement

This exercise implements three procedures:

1. Process monthly interest for savings accounts.
2. Update employee bonus for a selected department.
3. Transfer funds between two accounts with balance validation.

## Files

| File | Procedure | Description |
| --- | --- | --- |
| `ProcessMonthlyInterest.sql` | `ProcessMonthlyInterest` | Adds `1%` monthly interest to all savings accounts |
| `UpdateEmployeeBonus.sql` | `UpdateEmployeeBonus` | Increases salary for employees in a given department by a given bonus percentage |
| `TransferFunds.sql` | `TransferFunds` | Transfers amount from one account to another after checking sufficient balance |

## Concepts Used

- `CREATE OR REPLACE PROCEDURE`
- Input parameters
- `UPDATE` statements
- `SELECT INTO`
- Transaction control using `COMMIT` and `ROLLBACK`
- Exception handling using `WHEN OTHERS`
- Custom errors using `RAISE_APPLICATION_ERROR`
- `DBMS_OUTPUT.PUT_LINE`

## Assumed Tables

The scripts assume that the following tables already exist:

```text
Accounts(AccountID, AccountType, Balance)
Employees(EmployeeID, DepartmentID, Salary)
```

## How to Run

Open Oracle SQL Developer or SQL*Plus and enable output:

```sql
SET SERVEROUTPUT ON;
```

Create the procedures by running:

```sql
@ProcessMonthlyInterest.sql
@UpdateEmployeeBonus.sql
@TransferFunds.sql
```

## How to Execute Procedures

### Process Monthly Interest

```sql
EXEC ProcessMonthlyInterest;
```

Expected message:

```text
Monthly interest processed successfully.
```

### Update Employee Bonus

Example:

```sql
EXEC UpdateEmployeeBonus(10, 5);
```

This gives a `5%` salary increase to employees in department `10`.

Expected message:

```text
Employee bonus updated successfully.
```

### Transfer Funds

Example:

```sql
EXEC TransferFunds(101, 102, 500);
```

This transfers `500` from account `101` to account `102` if the source account has enough balance.

Expected success message:

```text
Funds transferred successfully.
```

Expected failure behavior:

```text
Transfer Failed: <error message>
```

## Learning Outcome

This exercise demonstrates how stored procedures make database logic reusable, maintainable, and transaction-safe for real-world business operations.
