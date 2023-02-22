package interfaces;

public class AppATM {
    public static void main(String[] args) {

        ATMImp1 useAtm = new ATMImp1();

        useAtm.payIn();
        useAtm.payOut();
        useAtm.bankConnectionInfo();
        System.out.println(CashMachine.atmStoppedWorking());

    }
}
