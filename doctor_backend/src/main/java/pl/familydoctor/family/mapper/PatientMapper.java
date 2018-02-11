package pl.familydoctor.family.mapper;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.domain.Sex;
import pl.familydoctor.family.resource.PatientDto;

@Service
public class PatientMapper {

    public Patient convertToPatient(PatientDto patientDto) {
        Patient patient = new Patient();
        patient.setSex(Enum.valueOf(Sex.class, patientDto.getSex()));
        patient.setFirstName(patientDto.getFirstName());
        patient.setLastName(patientDto.getLastName());
        patient.setBirthDate(patientDto.getBirthDate());

        return patient;
    }
}
