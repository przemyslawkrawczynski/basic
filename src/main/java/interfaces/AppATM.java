package interfaces;

public class AppATM {
    public static void main(String[] args) {

        CashMachine useAtm = new ATMImp1();

        useAtm.payIn();
        useAtm.payOut();
        useAtm.bankConnectionInfo();
        System.out.println(CashMachine.atmStoppedWorking());

    }
}
