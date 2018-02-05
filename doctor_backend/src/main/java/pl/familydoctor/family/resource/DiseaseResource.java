package pl.familydoctor.family.resource;

import org.springframework.web.bind.annotation.*;
import pl.familydoctor.family.domain.Disease;
import pl.familydoctor.family.repository.DiseaseRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/user/patient/{patientId}/disease")
public class DiseaseResource {

    private final DiseaseRepository diseaseRepository;

    public DiseaseResource(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    @GetMapping
    @ResponseBody
    public List<Disease> getAllDiseaseByPatientId(@PathVariable("patientId") Long patientId){

        return diseaseRepository.getAllByPatientId(patientId);
    }


}
