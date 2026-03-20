package encapsulare;

public class Ex {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountHolder("test");
        bankAccount.setBalance(-1);
        bankAccount.setPin("1234");

        System.out.println(bankAccount.getAccountHolder());
        System.out.println(bankAccount.getBalance());
    }
}
