CREATE OR REPLACE PROCEDURE TransferFunds (
  from_account_id IN NUMBER,
  to_account_id IN NUMBER,
  amount IN NUMBER
) IS
  v_balance NUMBER;
  insufficient_balance EXCEPTION;
BEGIN
  -- Lock and check source account balance
  SELECT balance INTO v_balance
  FROM accounts
  WHERE account_id = from_account_id
  FOR UPDATE;

  IF v_balance < amount THEN
    RAISE insufficient_balance;
  END IF;

  -- Deduct from source
  UPDATE accounts
  SET balance = balance - amount
  WHERE account_id = from_account_id;

  -- Add to destination
  UPDATE accounts
  SET balance = balance + amount
  WHERE account_id = to_account_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer successful: ' || amount || ' from ' || from_account_id || ' to ' || to_account_id);

EXCEPTION
  WHEN insufficient_balance THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance in account ' || from_account_id);
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/
