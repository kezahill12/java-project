public class PersonalATM {

    public static void main(String[] args) {

        ATM atm = new ATM(100.0);

        System.out.println("Initial Balance: " + atm.checkBalance());

        atm.deposit(50.0);
        System.out.println("Deposited 50.0, New Balance: " + atm.checkBalance());

        atm.withdraw(30.0);
        System.out.println("Withdrew 30.0, New Balance: " + atm.checkBalance());
    }
}

class ATM {

    public double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }
}
