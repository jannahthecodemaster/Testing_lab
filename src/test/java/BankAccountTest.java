import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.extractProperty;

public class BankAccountTest {

    BankAccount bankaccount;

    @BeforeEach
    public void setUp() {
        bankaccount = new BankAccount("Jannah", "Anwar", "30/03/2002", "12/07/2023", 12345678, 0, -50, 1.75);
    }

    @Test
    public void hasFirstName(){
        //Given
        //When
        String actual = bankaccount.getFirstName();
        //Then
        String expected = "Jannah";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void hasLastName(){
        //Given
        //When
        String actual = bankaccount.getLastName();
        //Then
        String expected = "Anwar";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void hasDateOfBirth(){
        //Given
        //When
        String actual = bankaccount.getDateOfBirth();
        //Then
        String expected = "30/03/2002";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasLocalDate(){
        //Given
        //When
        String actual = bankaccount.getLocalDate();
        //Then
        String expected = "12/07/2023";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void getAccountNumberTest(){
        //Given
        //When
        int actual = bankaccount.getAccountNumber();
        //Then
        int expected = 12345678;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getBalanceTest(){
        //Given
        //When
        int actual = bankaccount.getBalance();
        //Then
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
//setters
    @Test
    public void setFirstName(){
        bankaccount.setFirstName("Bob");
        String actual = bankaccount.getFirstName();
        String expected = "Bob";
        assertThat(actual).isEqualTo(expected);
    }

    public void setLastName(){
        bankaccount.setFirstName("Marley");
        String actual = bankaccount.getLastName();
        String expected = "Marley";
        assertThat(actual).isEqualTo(expected);
    }

    public void setDateOfBirth(){
        bankaccount.setDateOfBirth("22/08/2002");
        String actual = bankaccount.getDateOfBirth();
        String expected = "22/08/2002";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setAccountNumber(){
        bankaccount.setAccountNumber(87654321);
        int actual = bankaccount.getAccountNumber();
        assertThat(actual).isEqualTo(87654321);
    }

    @Test
    public void setBalance() {
        bankaccount.setBalance(3200);
        int actual = bankaccount.getBalance();
        assertThat(actual).isEqualTo(3200);
    }

    @Test
    public void deposit(){
        //Given
        //When
        bankaccount.addBalance(300);
        int actual = bankaccount.getBalance();
        //Then
        int expected = 300;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void withdrawal(){
        //Given
        //When
        bankaccount.removeBalance(100);
        int actual = bankaccount.getBalance();
        //Then
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void withdrawalMessage() {
        //Given
        //When
        String actual = bankaccount.removeBalance(100);
        //Then
        String expected = "You have reached your overdraft limit: incomplete withdrawal";;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void payInterestTest(){
        bankaccount.payInterest(1.75);
        double actual = bankaccount.getBalance();
        double expected = 0 * 1.75;
        assertThat(actual).isEqualTo(expected);
    }

}


