public class AdapterTest {//тест

    public static void main(String[] args) {
        BankB bankB = new BankB();
        bankB.getBalance();
        BankBAdapter bankA = new BankBAdapter(new BankA());
        bankA.getBalance();
    }
}
