package pl.familydoctor.family.validation;

import org.springframework.stereotype.Service;
import pl.familydoctor.family.resource.dto.DiseaseDto;

@Service
public class DiseaseDateValidator {

    public Boolean isValid(DiseaseDto diseaseDto) {
        if (diseaseDto.getDiseaseEndDate().before(diseaseDto.getDiseaseStartDate())) {
            return Boolean.FALSE;
        } else {
            return true;
        }
    }
}
