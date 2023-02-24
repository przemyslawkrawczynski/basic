package employeesalaries;

abstract class SalaryProcessor {

    private Employee employee;

    public SalaryProcessor(Employee employee){
     this.employee = employee;

    }

    protected abstract void payout();

    public void processPayOut(){
        System.out.println("Processing payment for:" + this.employee.calculateSalary());
        this.payout();
        System.out.println("Payment processed");

    }

    }
