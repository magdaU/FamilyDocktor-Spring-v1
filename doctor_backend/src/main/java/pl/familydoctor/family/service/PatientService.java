package pl.familydoctor.family.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void addPatient(Patient patient) {
        if (patient.getId() == null || patient.getId() == 0) {
            patientRepository.save(patient);
        }
    }
}
