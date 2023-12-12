public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Положено " + sum + " сом. Остаток на счете: " + amount + " сом.");
    }

    public void withDraw(int sum) throws LimitException{
        if (sum > amount) {
            throw new LimitException("Недостаточно средств на счете", amount);
        } else {
            amount -= sum;
            System.out.println("Снято " + sum + " сом. Остаток на счете: " + amount + " сом.");
        }
    }
}
