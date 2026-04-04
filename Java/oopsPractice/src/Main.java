
public class Main {

    public static void main(String[] args) {

    //    J1BankAccount ba= new J1BankAccount();
        SavingsAccount sa=new SavingsAccount("SB-1201413454","Rajesh",25000);
        // sa.displayInfo();
        // sa.withdraw(1000);
        // sa.applyIntrest();
        sa.displayInfo();
        sa.deposit(5000);
        sa.withdraw(20000);
        }
    }
