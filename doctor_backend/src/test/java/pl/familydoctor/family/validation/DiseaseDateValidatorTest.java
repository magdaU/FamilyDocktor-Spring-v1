package pl.familydoctor.family.validation;

import org.junit.Assert;
import org.junit.Test;
import pl.familydoctor.family.resource.dto.DiseaseDto;

import java.util.Date;

public class DiseaseDateValidatorTest {

    @Test
    public void whenStartAndEndDateAreEqual_thenReturnTrue() {
        //Given
        Date date = new Date();
        DiseaseDto diseaseDto = new DiseaseDto();
        diseaseDto.setDiseaseEndDate(date);
        diseaseDto.setDiseaseStartDate(date);

        DiseaseDateValidator dateValidator = new DiseaseDateValidator();

        //When
        Boolean result = dateValidator.isValid(diseaseDto);

        //Then
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void whenStartAfterEndDate_thenReturnFalse() {
        //Given
        Date startDate = new Date();
        Date endDate = new Date(117,1,1);
        DiseaseDto diseaseDto = new DiseaseDto();
        diseaseDto.setDiseaseStartDate(startDate);
        diseaseDto.setDiseaseEndDate(endDate);

        DiseaseDateValidator dateValidator = new DiseaseDateValidator();

        //When
        Boolean result = dateValidator.isValid(diseaseDto);

        //Then
        Assert.assertEquals(Boolean.FALSE, result);

    }
    @Test
    public void whenEndDateAfterStartDate_thenReturnTrue(){
        //Given
        Date endDate = new Date();
        Date startDate = new Date(117,1,1);
        DiseaseDto diseaseDto= new DiseaseDto();
        diseaseDto.setDiseaseStartDate(startDate);
        diseaseDto.setDiseaseEndDate(endDate);

        DiseaseDateValidator dateValidator = new DiseaseDateValidator();

        //When
        Boolean result = dateValidator.isValid(diseaseDto);

        //Then
        Assert.assertEquals(Boolean.TRUE, result);
    }

}