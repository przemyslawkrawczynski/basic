package employeesalaries;

public class EmployeeAcord implements Employee {

    int numberOfProducts;
    double wagePerProduct;

    EmployeeAcord(int numberOfProducts, double wagePerProduct) {
        this.numberOfProducts = numberOfProducts;
        this.wagePerProduct = wagePerProduct;

    }

    public double calculateSalary() {
        return this.numberOfProducts * this.wagePerProduct; //dlaczego tutaj też trzeba używać this?
    }
}
