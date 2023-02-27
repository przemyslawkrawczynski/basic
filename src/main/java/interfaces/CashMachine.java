package interfaces;
//tworze interejs CashMachine i okreslam w nim 4 metody, w tym jedna domyslna, jedna statyczna i dwie
interface CashMachine {

    void payIn();

    void payOut();

    default void bankConnectionInfo() {
        System.out.println("Bank Connection Success!");
    }

    static String atmStoppedWorking() {

        return "ATM has finished working";
    }

}
