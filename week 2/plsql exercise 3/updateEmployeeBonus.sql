CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept_id IN NUMBER,
  bonus_pct IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_pct / 100)
  WHERE department_id = dept_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Bonus updated for department ID: ' || dept_id);
END;
/
