public class BankBAdapter extends BankB {
    private BankA bankA;
    public BankBAdapter(BankA bankA) {
        this.bankA = bankA;
    }
    public void getBalance() {
        bankA.getBalance();
    }
}
