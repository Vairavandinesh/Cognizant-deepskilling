DECLARE
  CURSOR cur_due_loans IS
    SELECT LoanID, CustomerID, DueDate
    FROM Loans
    WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

  v_name Customers.Name%TYPE;
BEGIN
  FOR loan_rec IN cur_due_loans LOOP
    SELECT Name INTO v_name
    FROM Customers
    WHERE CustomerID = loan_rec.CustomerID;

    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Dear ' || v_name ||
      ', your loan ID ' || loan_rec.LoanID ||
      ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
/
