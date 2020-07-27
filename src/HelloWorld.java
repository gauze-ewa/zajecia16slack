public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from github" );
        Employee []employees={new Employee("a","b",2345)};
        
        double allSalary=FinanceOffice.getAllSAlry(employees);
        System.out.println("allSalary = " + allSalary);
    }
}
