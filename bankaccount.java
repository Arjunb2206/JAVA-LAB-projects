public class bankaccount {
    String accountno ;
    int balance;

    public bankaccount(String accountno , int balance) {
        this.accountno = accountno;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number :"+accountno);
        System.out.println("balance: " + balance);
    }
}

class accountdetails{
    public static bankaccount createacc() {
        bankaccount b = new bankaccount("ac002",8000);
        return b;
    }
    public static void main(String[] args) {
        bankaccount b1 = createacc();
        b1.display();
    }
}
