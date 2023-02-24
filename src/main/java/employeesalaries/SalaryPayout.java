package employeesalaries;

public class SalaryPayout extends SalaryProcessor {

public SalaryPayout(Employee employee){
    super(employee);
}

    @Override
    protected void payout() {
        System.out.println("sending");
    }
}
