package pl.familydoctor.family;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.domain.Sex;
import pl.familydoctor.family.repository.PatientRepository;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private PatientRepository patientRepository;

    @org.junit.Test
    public void initData() {
        Patient patient = new Patient();
        patient.setBirthDate(new Date());
        patient.setFirstName("Magda");
        patient.setLastName("U");
        patient.setSex(Sex.FEMALE);

        patientRepository.save(patient);
    }
}
