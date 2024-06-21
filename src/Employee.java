import java.util.Objects;

public class Employee {

    private static int employeeCounter = 0;

    private String fullName;
    private int department;
    private int salary;
    private int id;

    public Employee(String fullName, int department, int salary) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        } else {
            throw new RuntimeException("Неправильный депортамент");
        }
        this.fullName = fullName;
        this.salary = salary;
        this.id = ++employeeCounter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        }
    }

    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Сотрудник:" +
                "ФИО - " + fullName + '\'' +
                ", отдел - " + department +
                ", зарплата - " + salary +
                ", id [" + id + " ]";
    }
}
