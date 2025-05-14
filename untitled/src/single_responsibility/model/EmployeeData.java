package single_responsibility.model;

public class EmployeeData {

    private String name;
    private int totalHoursWorked;

    public EmployeeData(String name, int totalHoursWorked) {
        this.name = name;
        this.totalHoursWorked = totalHoursWorked;
    }

    public String getName() {
        return name;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }
}
