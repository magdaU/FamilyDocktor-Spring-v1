package pl.familydoctor.family.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import pl.familydoctor.family.domain.Disease;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.domain.Sex;
import pl.familydoctor.family.repository.DiseaseRepository;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.dto.DiseaseDto;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiseaseServiceTestIT {

    public static final String SYMPTOM_HIGH_TEMPERATURE = "Wysoka goraczka 40 stopni";

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private DiseaseRepository diseaseRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Test
    @Rollback
    public void whenEndDateBeforStart_thenNoSaveOnDb() {
        //Given
        diseaseRepository.deleteAll();

        Patient patient = new Patient();
        patient.setSex(Sex.MALE);
        patient.setLastName("Kowalski");
        patient.setFirstName("Jan");
        patient.setBirthDate(new Date());
        patientRepository.save(patient);

        Date startDate = new Date();
        Date endDate = new Date(117, 1, 1);
        DiseaseDto disease = new DiseaseDto();
        disease.setPatientId(patient.getId());
        disease.setDiseaseStartDate(startDate);
        disease.setDiseaseEndDate(endDate);
        disease.setDiagnosis(" Goraczka");
        disease.setIsDoctorDiagnosis(false);
        disease.setSymptom(SYMPTOM_HIGH_TEMPERATURE);

        //When
        diseaseService.createDisease(disease);

        //Then
        List<Disease> found = diseaseRepository.getAllBySymptom(SYMPTOM_HIGH_TEMPERATURE);
        Assert.assertEquals(0, found.size());
    }

}