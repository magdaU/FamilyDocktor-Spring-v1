package pl.familydoctor.family.resource;

import org.springframework.web.bind.annotation.*;
import pl.familydoctor.family.service.PatientService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/patient")
public class PatientResource {

    private final PatientService patientService;

    public PatientResource(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public @ResponseBody
    List<PatientDto> getAll() {
        return patientService.findAll();
    }

    @PostMapping
    public void addPatient(@RequestBody PatientDto patientDto) {
        patientService.addPatient(patientDto);
    }
}
