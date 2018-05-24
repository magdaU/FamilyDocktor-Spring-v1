package pl.familydoctor.family.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.PatientDto;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest
{
    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

    @Rollback
    @Test
    public void whenBirthDateAfterToday_thenNoSaveOnDB(){

        //Given
        patientRepository.deleteAll();

        PatientDto patientDto= new PatientDto();
        patientDto.setBirthDate(new Date(1000,1,1));
        patientDto.setLastName("");
        patientDto.setFirstName("Amelia");
        patientDto.setSex("FEMALE");

        //When
        patientService.addPatient(patientDto);

        //Then
        List<Patient> all = patientRepository.findAll();
        Assert.assertEquals(0, all.size());
    }



}
