import java.util.LinkedList;
import java.util.List;
import Utilities.CSV;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();
        
        // Test account
        // Checking chkacc1 = new Checking("Tom Wilson", "321456879", 1500);
        // Savings savacc1 = new Savings("Rich Lowe", "123456789", 2500);

        // savacc1.showInfo();
        // System.out.println("***************");
        // chkacc1.showInfo();

        // savacc1.deposit(5000);
        // savacc1.withdraw(200);
        // savacc1.transfer("Brokerage", 3000);

        // Read a csv file then create new accounts based on that account
        String file = "NewBankAccounts.csv";
        List<String[]> newAccountHolder = Utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            // System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                // System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if (accountType.equals("Checking")) {
                // System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n**************************");
            acc.showInfo();
        }
        
    }
    
}
