package jdbc;

import java.util.List;

public interface EmployeeDao {
public void createEmployee(Employee employe);
public List <Employee> getAllEmployees();
public Employee getEmployeeById(int id);
public Employee delete(int id);
}
