package banktransaciton;

public class CashMachinePayOut extends BankPayOut{

    protected void insertCard(){
        System.out.println("Please insert card.");
    }

    protected void providePin(){
        System.out.println("Please insert pin number:");
    }

    protected void provideAmount(){
        System.out.println("Please provide amount:");
    }

    protected void payCashOut(){
        System.out.println("...Cash is payed out of the ATM...");
    }

    protected void thankForUsingService(){

        System.out.println("Thank you for using our ATM!");
    }


}
