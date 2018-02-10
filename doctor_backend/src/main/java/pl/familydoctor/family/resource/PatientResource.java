package pl.familydoctor.family.resource;

import org.springframework.web.bind.annotation.*;
import pl.familydoctor.family.domain.Patient;
import pl.familydoctor.family.repository.PatientRepository;
import pl.familydoctor.family.service.PatientService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/patient")
public class PatientResource {

    private final PatientRepository patientRepository;
    private final PatientService patientService;

    public PatientResource(PatientRepository patientRepository, PatientService patientService) {
        this.patientRepository = patientRepository;
        this.patientService = patientService;
    }

    @GetMapping
    public @ResponseBody
    List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @PostMapping
    public void addPatient (@RequestBody PatientDto patientDto){
        patientService.addPatient(patientDto);
    }
}
