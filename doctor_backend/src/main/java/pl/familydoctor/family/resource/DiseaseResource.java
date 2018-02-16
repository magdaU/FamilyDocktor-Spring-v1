package pl.familydoctor.family.resource;

import org.springframework.web.bind.annotation.*;
import pl.familydoctor.family.domain.Disease;
import pl.familydoctor.family.repository.DiseaseRepository;
import pl.familydoctor.family.resource.dto.DiseaseDto;
import pl.familydoctor.family.service.DiseaseService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/patient/disease")
public class DiseaseResource {

    private final DiseaseService diseaseService;

    public DiseaseResource(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @PostMapping
    public void saveDisease(@RequestBody DiseaseDto diseaseDto) {
        System.out.println(diseaseDto);
        diseaseService.createDisease(diseaseDto);
    }

    @GetMapping
    public List<DiseaseDto> getAllDiseases() {
        return diseaseService.getAllDisease();
    }
}
