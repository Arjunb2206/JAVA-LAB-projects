import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        int balance = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient balance.");
            }
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
