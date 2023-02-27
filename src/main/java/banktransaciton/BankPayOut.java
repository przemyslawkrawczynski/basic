package banktransaciton;
abstract class BankPayOut {
    abstract protected void insertCard();
    abstract protected void providePin();
    abstract protected void provideAmount();
    private void informAboutRequestStatus() {
        System.out.println("Success! Request accepted by Bank.");
    }
    private void checkAccountBalance() {
        System.out.println("...checking account balance...");
    }
    private void confirmIfPayOutPossible() {
        System.out.println("Success! Payment can be processed.");
    }
    abstract protected void payCashOut();
    abstract protected void thankForUsingService();
    public void initiatePayOut(){
        this.insertCard();
        this.providePin();
        this.provideAmount();
        this.informAboutRequestStatus();
        this.checkAccountBalance();
        this.confirmIfPayOutPossible();
        this.payCashOut();
        this.thankForUsingService();
    }
}
