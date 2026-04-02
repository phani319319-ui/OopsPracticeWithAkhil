public class SavingsAccount extends J1BankAccount{

    double intrestRate=0.12;

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("intrest rate for this account "+intrestRate);
    }

    public void applyIntrest(){
        double intrest =getBalance()*intrestRate;
         setBalance(getBalance()+intrest);
    }

    public SavingsAccount(String accountNo, String accountHolderName, double balance){
        super(accountNo,accountHolderName,balance);

      }
}
