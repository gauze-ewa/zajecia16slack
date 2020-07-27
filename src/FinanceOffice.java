public class FinanceOffice {
    public static double getAllSAlry(Employee []employees) {
        double salarySum=0;
        for (Employee e:
             employees) {
salarySum+=e.getSalary();        }
        return salarySum;
    }
}
