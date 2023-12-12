public class Main {
    public static void main(String[] args) {
        try {
            BankAccount bankAccount = new BankAccount(15000);

            while (true) {
                try {
                    bankAccount.withDraw(6000);
                } catch (LimitException le) {
                    double remainingAmount = le.getRemainingAmount();
                    System.out.println("Недостаточно средств. Снимаем только " + remainingAmount + " сом.");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}