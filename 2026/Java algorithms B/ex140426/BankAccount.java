package ex140426;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName){
        this.ownerName = ownerName;
        this.balance = 0;
    }
    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public BankAccount(BankAccount other){  // בנאי העתקה
        this.ownerName = other.ownerName;
        this.balance = other.balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double sum){
        if (sum >= 0)
            this.balance += sum;
    }
    public double withdraw(double sum){
        if (sum <= this.balance){
            this.balance -= sum;
            return sum;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
