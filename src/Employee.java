public class Employee {
    public final String name;
    public final String LastName;
    public final  double salary;

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        LastName = lastName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }
}
