DECLARE
  CURSOR cur_senior_customers IS
    SELECT CustomerID, LoanInterestRate
    FROM Customers
    WHERE Age > 60;
BEGIN
  FOR cust IN cur_senior_customers LOOP
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE CustomerID = cust.CustomerID;
  END LOOP;
  COMMIT;
END;
/
