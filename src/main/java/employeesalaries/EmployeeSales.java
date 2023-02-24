package employeesalaries;

public class EmployeeSales implements Employee {

    double baseSalary;
    boolean isSalesRealized;
    double salaryBonus;

    EmployeeSales(double baseSalary, boolean isSalesRealized, double salaryBonus) {
        this.baseSalary = baseSalary;
        this.isSalesRealized = isSalesRealized;
        this.salaryBonus = salaryBonus;

    }

    public double calculateSalary() {

        if (isSalesRealized) {

            return this.baseSalary + this.baseSalary * this.salaryBonus;
        }
        return this.baseSalary;


    }

}
