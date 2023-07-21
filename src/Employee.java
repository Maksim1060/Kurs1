import java.util.Objects;

class Employee {
    private static int ID_COUNTER = 0;
    private int id;
    private String name;
    private String surName;
    private String midlleName;
    private int salary;
    private int departament;


    public Employee(String name, String surName, String midlleName, int salary, int departament) {
        this.name = name;
        this.surName = surName;
        this.midlleName = midlleName;
        this.salary = salary;
        this.departament = departament;
        this.id = ID_COUNTER++;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMidlleName() {
        return midlleName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartament(int  departament) {
        this.departament = departament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && departament == employee.departament && Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName) && Objects.equals(midlleName, employee.midlleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, midlleName, salary, departament);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", midlleName='" + midlleName + '\'' +
                ", salary=" + salary +
                ", departament=" + departament +
                '}';
    }
}
