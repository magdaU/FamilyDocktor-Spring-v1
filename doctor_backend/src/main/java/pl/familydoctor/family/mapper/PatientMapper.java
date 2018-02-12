package pl.familydoctor.family.mapper;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.domain.Sex;
import pl.familydoctor.family.resource.PatientDto;

import java.util.ArrayList;
import java.util.List;

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

    public List<PatientDto> convertToPatientsDto(List<Patient> patients) {
        List<PatientDto> results = new ArrayList<>();

        patients.forEach(patient -> {
            PatientDto patientDto = convertToPatientDto(patient);
            results.add(patientDto);
        });
        return results;
    }

    public PatientDto convertToPatientDto(Patient patient) {
        PatientDto patientDto= new PatientDto();
        patientDto.setBirthDate(patient.getBirthDate());
        patientDto.setFirstName(patient.getFirstName());
        patientDto.setLastName(patient.getLastName());
        patientDto.setSex(patient.getSex().name());
        patientDto.setId(patient.getId());
        return patientDto;
    }
}
