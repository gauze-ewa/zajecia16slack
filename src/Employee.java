public class Employee {
    public final String name;
    public final String LastName;

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
