package pl.familydoctor.family.validation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class BirthdayValidatorTest {

    @Test
    public void whenBirthDateIsToday_thenReturnTrue() {
        // Given
        Date today = new Date();
        BirthdayValidator validator = new BirthdayValidator();

        // When
        Boolean result = validator.isValid(today);

        // Then
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void whenBirthDateBeforeToday_thenReturnTrue(){
        //Given
        Date beforeNow = new Date(117,1,1);
        BirthdayValidator validator = new BirthdayValidator();
        //When
        Boolean result = validator.isValid(beforeNow);
        //Then
        Assert.assertEquals(Boolean.TRUE,result);
    }
    @Test
    public void whenBirthDateAfterToday_thenReturnFalse(){
        //Given
        Date future = new Date(317, 1, 1);
        BirthdayValidator validator = new BirthdayValidator();
        //When
        Boolean result = validator.isValid(future);
        //Then
        Assert.assertEquals(Boolean.FALSE, result);
    }
}