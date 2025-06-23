DECLARE
  CURSOR cur_vip_candidates IS
    SELECT CustomerID
    FROM Customers
    WHERE Balance > 10000;
BEGIN
  FOR cust IN cur_vip_candidates LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = cust.CustomerID;
  END LOOP;
  COMMIT;
END;
/
