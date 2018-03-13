package pl.familydoctor.family.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.familydoctor.family.domain.MedicalAdvice;
import pl.familydoctor.family.repository.MedicalAdviceRepository;

import java.util.List;

//@CrossOrigin(origins = "http://194.182.71.59:8080")
@RestController
@RequestMapping(path = "/advice")
public class MedicalAdviceResource {

    private final MedicalAdviceRepository medicalAdviceRepository;

    @Autowired
    public MedicalAdviceResource(MedicalAdviceRepository medicalAdviceRepository) {
        this.medicalAdviceRepository = medicalAdviceRepository;
    }

    @GetMapping
    public @ResponseBody
    List<MedicalAdvice> getAll() {
        return medicalAdviceRepository.findAll();
    }
}
