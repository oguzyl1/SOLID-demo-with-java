package single_responsibility.util;

import single_responsibility.model.EmployeeData;

public class HoursReporter {
    public void reportHours(EmployeeData employeeData) {
        System.out.println(employeeData.getName() + " worked " + employeeData.getTotalHoursWorked() + " hours");
    }
}
