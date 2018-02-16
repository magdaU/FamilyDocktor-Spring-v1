package pl.familydoctor.family.mapper;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.domain.Sex;
import pl.familydoctor.family.resource.PatientDto;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientMapper implements Mapper<PatientDto, Patient> {

    @Override
    public Patient convertToEntity(PatientDto dto) {
        Patient patient = new Patient();
        patient.setSex(Enum.valueOf(Sex.class, dto.getSex()));
        patient.setFirstName(dto.getFirstName());
        patient.setLastName(dto.getLastName());
        patient.setBirthDate(dto.getBirthDate());
        return patient;
    }

    @Override
    public PatientDto convertToDto(Patient entity) {
        PatientDto patientDto = new PatientDto();
        patientDto.setBirthDate(entity.getBirthDate());
        patientDto.setFirstName(entity.getFirstName());
        patientDto.setLastName(entity.getLastName());
        patientDto.setSex(entity.getSex().name());
        patientDto.setId(entity.getId());
        return patientDto;
    }

    @Override
    public List<Patient> convertToEntities(List<PatientDto> dtos) {
        throw new NotImplementedException();
    }

    @Override
    public List<PatientDto> convertToDtos(List<Patient> entities) {
        List<PatientDto> results = new ArrayList<>();

        entities.forEach(patient -> {
            PatientDto patientDto = convertToDto(patient);
            results.add(patientDto);
        });
        return results;
    }
}
