package pl.familydoctor.family.resource;

import org.springframework.web.bind.annotation.*;
import pl.familydoctor.family.resource.dto.DiseaseDto;
import pl.familydoctor.family.service.DiseaseService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/disease")
public class DiseaseResource {

    private final DiseaseService diseaseService;

    public DiseaseResource(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @PostMapping
    public void saveDisease(@RequestBody DiseaseDto diseaseDto) {
        diseaseService.createDisease(diseaseDto);
    }

    @GetMapping
    @RequestMapping("/patient/{idPatient}")
    public List<DiseaseDto> getDiseasesByPatient(@PathVariable("idPatient") Long idPatient) {
        return diseaseService.getDiseasesByPatient(idPatient);
    }

    @PutMapping
    public DiseaseDto updateDisease(@RequestBody DiseaseDto diseaseDto){
        return diseaseService.updateDisease(diseaseDto);
    }
    @DeleteMapping
    public void deleteDisease(@RequestBody DiseaseDto diseaseDto){
        diseaseService.deleteDisease(diseaseDto);
    }
}
