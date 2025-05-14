package single_responsibility;

import single_responsibility.model.EmployeeData;
import single_responsibility.service.EmployeeService;

public class SingleResponsibility {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData("Oğuz", 15);

        EmployeeService facade = new EmployeeService();

        double pay = facade.calculatePay(employeeData);
        System.out.println("hesaplanan ödeme: " + pay);

        facade.reportHours(employeeData);
        facade.saveEmployee(employeeData);
    }
}
