package pl.familydoctor.family.service;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Disease;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.mapper.Mapper;
import pl.familydoctor.family.repository.DiseaseRepository;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.resource.dto.DiseaseDto;
import pl.familydoctor.family.validation.DiseaseDateValidator;

import java.util.List;

@Service
public class DiseaseService {

    private final Mapper<DiseaseDto, Disease> diseaseMapper;

    private final DiseaseRepository diseaseRepository;

    private final PatientRepository patientRepository;

    private final DiseaseDateValidator diseaseDateValidator;

    public DiseaseService(Mapper<DiseaseDto, Disease> diseaseMapper, DiseaseRepository diseaseRepository, PatientRepository patientRepository, DiseaseDateValidator diseaseDateValidator) {
        this.diseaseMapper = diseaseMapper;
        this.diseaseRepository = diseaseRepository;
        this.patientRepository = patientRepository;
        this.diseaseDateValidator = diseaseDateValidator;
    }

    public void createDisease(DiseaseDto diseaseDto) {
        if (diseaseDateValidator.isValid(diseaseDto)) {
            Long patientId = diseaseDto.getPatientId();
            Disease disease = diseaseMapper.convertToEntity(diseaseDto);
            Patient patient = patientRepository.findOne(patientId);
            disease.setPatient(patient);
            diseaseRepository.save(disease);
        }
    }

    public List<DiseaseDto> getDiseasesByPatient(Long patientId) {
        List<Disease> diseaseList = diseaseRepository.getAllByPatientId(patientId);
        List<DiseaseDto> diseaseDtoList = diseaseMapper.convertToDtos(diseaseList);
        return diseaseDtoList;
    }

    public DiseaseDto updateDisease(DiseaseDto diseaseDto) {
        if (diseaseDto.getId() > 0) {
            Disease disease = diseaseRepository.findOne(diseaseDto.getId());
            disease.setDiseaseEndDate(diseaseDto.getDiseaseEndDate());
            disease.setDiseaseStartDate(diseaseDto.getDiseaseStartDate());
            disease.setDiagnosis(diseaseDto.getDiagnosis());
            disease.setSymptom(diseaseDto.getSymptom());
            disease.setDoctorDiagnosis(diseaseDto.getIsDoctorDiagnosis());
            diseaseRepository.save(disease);
            return diseaseMapper.convertToDto(disease);
        }
        return null;
    }

    public void deleteDisease(DiseaseDto diseaseDto) {
        if (diseaseDto.getId() > 0) {
            diseaseRepository.delete(diseaseDto.getId());
        }
    }
}
