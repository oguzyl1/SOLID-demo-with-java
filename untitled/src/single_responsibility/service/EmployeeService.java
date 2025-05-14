package single_responsibility.service;

import single_responsibility.model.EmployeeData;
import single_responsibility.repository.EmployeeRepository;
import single_responsibility.util.HoursReporter;
import single_responsibility.util.PayrollCalculator;

public class EmployeeService {

    private PayrollCalculator payrollCalculator = new PayrollCalculator();
    private HoursReporter hoursReporter = new HoursReporter();
    private EmployeeRepository employeeDatabase = new EmployeeRepository();

    public double calculatePay(EmployeeData employeeData) {
        return payrollCalculator.calculatePay(employeeData);
    }

    public void reportHours(EmployeeData employeeData) {
        hoursReporter.reportHours(employeeData);
    }

    public void saveEmployee(EmployeeData employeeData) {
        employeeDatabase.save(employeeData);
    }
}
