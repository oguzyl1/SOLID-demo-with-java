package single_responsibility.repository;

import single_responsibility.model.EmployeeData;

public class EmployeeRepository {

    public void save (EmployeeData employeeData){
        System.out.println("Saving employee data : " + employeeData.getName());
    }
}
