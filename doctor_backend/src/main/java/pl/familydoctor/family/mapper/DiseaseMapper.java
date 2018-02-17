package pl.familydoctor.family.mapper;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Disease;
import pl.familydoctor.family.resource.dto.DiseaseDto;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiseaseMapper implements Mapper<DiseaseDto, Disease> {

    @Override
    public Disease convertToEntity(DiseaseDto dto) {
        Disease disease = new Disease();
        disease.setSymptom(dto.getSymptom());
        disease.setDiagnosis(dto.getDiagnosis());
        disease.setDiseaseStartDate(dto.getDiseaseStartDate());
        disease.setDiseaseEndDate(dto.getDiseaseEndDate());
        disease.setDoctorDiagnosis(dto.getIsDoctorDiagnosis());
        return disease;
    }

    @Override
    public DiseaseDto convertToDto(Disease entity) {
        DiseaseDto diseaseDto = new DiseaseDto();
        diseaseDto.setId(entity.getId());
        diseaseDto.setDiagnosis(entity.getDiagnosis());
        diseaseDto.setIsDoctorDiagnosis(entity.getDoctorDiagnosis());
        diseaseDto.setSymptom(entity.getSymptom());
        diseaseDto.setDiseaseStartDate(entity.getDiseaseStartDate());
        diseaseDto.setDiseaseEndDate(entity.getDiseaseEndDate());
        return diseaseDto;
    }

    @Override
    public List<Disease> convertToEntities(List<DiseaseDto> dtos) {
        return null;
    }

    @Override
    public List<DiseaseDto> convertToDtos(List<Disease> entities) {
        List<DiseaseDto> diseaseDtoList = new ArrayList<>();
        entities.forEach(disease -> {
            DiseaseDto diseaseDto = convertToDto(disease);
            diseaseDtoList.add(diseaseDto);
        });
        return diseaseDtoList;
    }
}
