package visitor;

import java.util.ArrayList;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class EmployeeList {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void accept(Department handler) {
        for (Employee employee : employees) {
            employee.accept(handler);
        }
    }
}
