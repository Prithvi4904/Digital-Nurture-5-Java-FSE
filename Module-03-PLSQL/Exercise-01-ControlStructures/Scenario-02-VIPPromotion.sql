SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN

    FOR customer_rec IN customer_cursor LOOP

        IF customer_rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'VIP customers updated successfully.'
    );

END;
/