public class SavingsAccount extends J1BankAccount{

    double interestRate=0.12;

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("interest rate for this account "+interestRate);
    }

    public void applyIntrest(){
        double interest =getBalance()*interestRate;
         setBalance(getBalance()+interest);
    }

    public SavingsAccount(String accountNo, String accountHolderName, double balance){
        super(accountNo,accountHolderName,balance);

      }
}
