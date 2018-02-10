package pl.familydoctor.family.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.domain.Sex;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.PatientDto;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void addPatient(PatientDto patientDto) {
        if (patientDto.getId() == null || patientDto.getId() == 0) {
            //TODO add mapper
            Patient patient = new Patient();
            patient.setSex(Enum.valueOf(Sex.class, patientDto.getSex()));
            patient.setFirstName(patientDto.getFirstName());
            patient.setLastName(patientDto.getLastName());
            patient.setBirthDate(patientDto.getBirthDate());
            patientRepository.save(patient);
        }
    }
}
