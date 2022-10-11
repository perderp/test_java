package Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();

        account.setData(1, "Chiron Jaspher Cainap", 5000);
        account.checkAccount();

        account.deposit(200);
        account.withdraw(1500);
        account.checkBalance();

    }
}
