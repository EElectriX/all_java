class Account {
   
    private String accountHolderName;
    private String accountNumber;
    private char accountType; 
    private double balance;

    
    private static int transactionCount = 0;

    
    public Account(String accountHolderName, String accountNumber, char accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionCount++;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 1000) {
            balance -= amount;
            transactionCount++;
            System.out.println("Withdrawn: ₹" + amount);
        } else if ((balance - amount) < 1000) {
            System.out.println("Withdrawal failed. Balance cannot go below ₹1000.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

   
    public String getAccountDetails() {
        return "Account Holder Name: " + accountHolderName + "\n" +
               "Account Number: " + accountNumber + "\n" +
               "Account Type: " + (accountType == 'S' ? "Savings" : "Current") + "\n" +
               "Balance: ₹" + balance + "\n" +
               "Total Transactions: " + transactionCount;
    }
}


public class Ques9 {
    public static void main(String[] args) {
      
        Account account = new Account("Saptarshi", "123456789", 'S', 5000);

       
        System.out.println(account.getAccountDetails()+"\n");

        
        account.deposit(1500);
        System.out.println(account.getAccountDetails()+"\n");

       
        account.withdraw(2000);
        System.out.println(account.getAccountDetails()+"\n");

        
        account.withdraw(4000); 
        System.out.println(account.getAccountDetails());
    }
}
