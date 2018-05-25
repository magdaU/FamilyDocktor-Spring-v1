package pl.familydoctor.family.validation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.PatientDto;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PatientFullNameValidatorTest {

    @InjectMocks
    private PatientFullNameValidator validator;

    @Mock
    private PatientRepository patientRepository;

    @Test
    public void whenFirstAndLastNameExistOnDB_ThenReturnFalse(){
        //Given
        List<Patient> patients = new ArrayList<>();

        Patient patient = new Patient();
        patient.setFirstName("Krzysztof");
        patient.setLastName("Ukleja");
        patients.add(patient);

        patient = new Patient();
        patient.setFirstName("Magdalena");
        patient.setLastName("Ukleja");
        patients.add(patient);
        Mockito.when(patientRepository.findAll()).thenReturn(patients);

        PatientDto patientDto= new PatientDto();
        patientDto.setFirstName("Magdalena");
        patientDto.setLastName("Ukleja");

        //When
        Boolean result = validator.isValid(patientDto);

        //Then
        Assert.assertEquals(false, result);
    }
    @Test
    public void whenLastAndFirstNameNotExistOnDb_ThenReturnTrue(){
        //Given
        List<Patient> patients = new ArrayList<>();

        Patient patient = new Patient();
        patient.setFirstName("Krzysztof");
        patient.setLastName("Ukleja");
        patients.add(patient);

        patient = new Patient();
        patient.setFirstName("Magdalena");
        patient.setLastName("Ukleja");
        patients.add(patient);
        Mockito.when(patientRepository.findAll()).thenReturn(patients);

        PatientDto patientDto= new PatientDto();
        patientDto.setFirstName("Adam");
        patientDto.setLastName("Kowaslki");

        //When
        Boolean result = validator.isValid(patientDto);

        //Then
        Assert.assertEquals(true, result);
    }

}