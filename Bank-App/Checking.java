
public class Checking extends Account {
    // List the properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
        // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        // System.out.println("NEW CHECKING ACCOUNT");
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    // List any methods specific to checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
        // System.out.println("CARD: " + this.debitCardNumber);
        // System.out.println("PIN: " + this.debitCardPin);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features" +
            "\n Debit Card Number: " + debitCardNumber +
            "\n Debit Card Pin: " + debitCardPin
        );
    }

    
}
