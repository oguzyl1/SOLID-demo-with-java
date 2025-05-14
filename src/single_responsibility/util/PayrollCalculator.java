package single_responsibility.util;

import single_responsibility.model.EmployeeData;

public class PayrollCalculator {

    public double calculatePay(EmployeeData employee) {
        int regularHours = calculateRegularHours(employee);
        return regularHours * 20;
    }

    private int calculateRegularHours(EmployeeData employee) {
        int totalHours = employee.getTotalHoursWorked();
        int editedHours;

        if (totalHours > 8) {
            editedHours = ((totalHours - 8) * 2) + 8;
        } else {
            editedHours = totalHours;
        }
        return editedHours;
    }
}
