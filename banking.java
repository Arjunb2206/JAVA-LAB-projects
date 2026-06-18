class banking{
   
    public static final double INTEREST_RATE = 0.05;

   
    private static double totalBankBalance = 0.0;

   
    private double accountBalance;

  
    public banking(double initialDeposit) {
        accountBalance = initialDeposit;
        totalBankBalance += initialDeposit;
    }


    public void deposit(double amount) {
        accountBalance += amount;
        totalBankBalance += amount;
    }

  
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            totalBankBalance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

   
    public void applyInterest() {
        double interest = accountBalance * INTEREST_RATE;
        accountBalance += interest;
        totalBankBalance += interest;
    }

  
    public double getAccountBalance() {
        return accountBalance;
    }

    public static double getTotalBankBalance() {
        return totalBankBalance;
    }
}


 class Main3{
    public static void main(String[] args) {
        banking acc1 = new banking(1000);
        banking acc2 = new banking(2000);

        acc1.deposit(500);
        acc2.applyInterest();

        System.out.println("Account 1 Balance: " + acc1.getAccountBalance());
        System.out.println("Account 2 Balance: " + acc2.getAccountBalance());
        System.out.println("Total Bank Balance: " + banking.getTotalBankBalance());
    }
}