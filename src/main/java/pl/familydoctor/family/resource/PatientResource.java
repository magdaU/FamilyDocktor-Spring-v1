package pl.familydoctor.family.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.repository.PatientRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/patient")
public class PatientResource {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientResource(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping
    public @ResponseBody
    List<Patient> getAll() {
        return patientRepository.findAll();
    }
}
