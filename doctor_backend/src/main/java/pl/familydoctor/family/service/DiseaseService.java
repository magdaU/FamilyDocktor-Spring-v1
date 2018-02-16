package pl.familydoctor.family.service;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.domain.Disease;
import pl.familydoctor.family.mapper.DiseaseMapper;
import pl.familydoctor.family.mapper.Mapper;
import pl.familydoctor.family.repository.DiseaseRepository;
import pl.familydoctor.family.resource.dto.DiseaseDto;

import java.util.List;

@Service
public class DiseaseService {

    private final Mapper<DiseaseDto, Disease> diseaseMapper;

    private final DiseaseRepository diseaseRepository;

    public DiseaseService(DiseaseMapper diseaseMapper, DiseaseRepository diseaseRepository) {
        this.diseaseMapper = diseaseMapper;
        this.diseaseRepository = diseaseRepository;
    }

    public void createDisease(DiseaseDto diseaseDto) {
        Disease disease = diseaseMapper.convertToEntity(diseaseDto);
        diseaseRepository.save(disease);
    }

    public List<DiseaseDto> getAllDisease() {
        List<Disease> diseaseList = diseaseRepository.findAll();
        List<DiseaseDto> diseaseDtoList = diseaseMapper.convertToDtos(diseaseList);
        return diseaseDtoList;
    }
}
