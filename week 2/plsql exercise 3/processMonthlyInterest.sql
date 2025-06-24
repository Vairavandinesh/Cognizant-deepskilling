CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE savings_accounts
  SET balance = balance + (balance * 0.01);

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
END;
/
