public class J1BankAccount {

    private String accountNo;
    private  String accountHolderName;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public J1BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

        public void deposit(double amount){
            balance+= amount;
            System.out.println("amount deposited of "+ amount+ " now balance is "+ balance);
    }

        public void withdraw(double amount){
            if(balance>=amount){
            balance-=amount;
            System.out.println("amount withdraw is  "+amount+" remaining balance is "+ balance);
           }
        else{
            System.out.println("Insufficet balance");
            }
    }
        public void displayInfo(){
            System.out.println("account holder name  "+ this.accountHolderName+"  account no "+this.accountNo+"   balane is  "+balance);

    }


    }

