package pl.familydoctor.family.resource;

import org.springframework.web.bind.annotation.*;
import pl.familydoctor.family.domain.Disease;
import pl.familydoctor.family.repository.DiseaseRepository;
import pl.familydoctor.family.resource.dto.DiseaseDto;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/patient/disease")
public class DiseaseResource {

    private final DiseaseRepository diseaseRepository;

    public DiseaseResource(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    @PostMapping
    public void saveDisease(@RequestBody DiseaseDto diseaseDto){
        System.out.println(diseaseDto);
    }


}
