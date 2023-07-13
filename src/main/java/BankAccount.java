public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    private String localDate;
    private int accountNumber;
    private int balance;
    private int overDraft;

    private double interestRate;

    public BankAccount(String firstName, String lastName, String dateOfBirth, String localDate, int accountNumber, int balance, int overdraft, double interestRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.localDate = localDate;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overDraft = overdraft;
        this.interestRate = interestRate;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getLocalDate() {
        return this.localDate;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    //setters
    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setDateOfBirth(String dob){
        this.dateOfBirth = dob;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void addBalance(int extraBalance) { //ASK WHY WHEN I DO PUBLIC VOID IT SAYS VOID AND INT ARE INCOMPATIBLE
        this.balance += extraBalance;
    }

    public String removeBalance(int balanceToBeTaken) {
        if (this.balance - balanceToBeTaken > this.overDraft){
            this.balance -= balanceToBeTaken;
            return "Completed withdrawal";
        } else return "You have reached your overdraft limit: incomplete withdrawal";
    }

    public double payInterest(double interestRate){
        return this.balance *= interestRate;
    }

}