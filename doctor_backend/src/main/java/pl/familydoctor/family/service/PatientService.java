package pl.familydoctor.family.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.PatientDto;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void addPatient(PatientDto patient) {
        System.out.println(patient);
//        if (patient.getId() == null || patient.getId() == 0) {
//            patientRepository.save(patient);
//        }
    }
}
