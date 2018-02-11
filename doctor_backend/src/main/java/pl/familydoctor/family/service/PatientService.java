package pl.familydoctor.family.service;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.mapper.PatientMapper;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.PatientDto;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    private final PatientMapper patientMapper;

    public PatientService(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    public void addPatient(PatientDto patientDto) {
        if (patientDto.getId() == null || patientDto.getId() == 0) {
            Patient patient = patientMapper.convertToPatient(patientDto);
            patientRepository.save(patient);
        }
    }
}
