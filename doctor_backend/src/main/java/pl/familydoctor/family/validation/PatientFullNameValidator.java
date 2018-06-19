package pl.familydoctor.family.validation;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.PatientDto;

import java.util.List;
import java.util.Optional;

@Service
public class PatientFullNameValidator {
    private final PatientRepository patientRepository;

    public PatientFullNameValidator(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Boolean isValid(PatientDto patientDto) {
        List<Patient> results = patientRepository.findAll();
        Optional<Patient> foundPatient = results
                .stream()
                .filter(patient -> patient.getFirstName().equalsIgnoreCase(patientDto.getFirstName())
                        && patient.getLastName().equalsIgnoreCase(patientDto.getLastName()))
                .findAny();
        return !foundPatient.isPresent();
    }
}
