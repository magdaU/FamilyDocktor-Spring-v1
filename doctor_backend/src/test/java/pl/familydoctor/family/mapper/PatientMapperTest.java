package pl.familydoctor.family.mapper;

import org.junit.Assert;
import org.junit.Test;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.domain.Sex;
import pl.familydoctor.family.resource.PatientDto;

import java.util.Date;

public class PatientMapperTest {

    public static final Long ID = 1L;
    public static final Sex FEMALE = Sex.FEMALE;
    public static final String LAST_NAME = "Kowal";
    public static final String FIRST_NA = "Magda";

    @Test
    public void shouldReturnDto() {

        // Given
        Date birthdate = new Date();
        Patient patient = new Patient();
        patient.setBirthDate(birthdate);
        patient.setFirstName(FIRST_NA);
        patient.setLastName(LAST_NAME);
        patient.setSex(FEMALE);
        patient.setId(ID);

        //When
        PatientMapper patientMapper = new PatientMapper();
        PatientDto patientDto = patientMapper.convertToDto(patient);

        //Then
        Assert.assertEquals(ID, patientDto.getId());
        Assert.assertEquals(FEMALE.name(), patientDto.getSex());
        Assert.assertEquals(LAST_NAME, patientDto.getLastName());
        Assert.assertEquals(FIRST_NA, patientDto.getFirstName());

    }

}