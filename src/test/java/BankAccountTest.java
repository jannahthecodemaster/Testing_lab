import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankaccount;

    @BeforeEach
    public void setUp() {
        bankaccount = new BankAccount("Jannah");
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


}


