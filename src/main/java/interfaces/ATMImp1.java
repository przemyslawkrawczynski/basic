package interfaces;

public class ATMImp1 implements CashMachine {

    @Override
    public void payIn() {

        System.out.println("Paying cash in!");

    }

    @Override
    public void payOut() {

        System.out.println("Paying cash out!");

    }
}
