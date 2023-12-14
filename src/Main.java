public class Main {
    public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount(15000);

            while (true) {
                try {
                    bankAccount.withDraw(6000);
                } catch (LimitException le) {
                    try {
                        bankAccount.withDraw((int) le.getRemainingAmount());
                    } catch (LimitException lex) {
                        lex.printStackTrace();
                    }
                    break;
                }
            }
    }
}