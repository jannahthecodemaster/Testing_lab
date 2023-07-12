import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    private LocalDate localDate;
    private int accountNumber;
    private int balance;

    public BankAccount(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

}
