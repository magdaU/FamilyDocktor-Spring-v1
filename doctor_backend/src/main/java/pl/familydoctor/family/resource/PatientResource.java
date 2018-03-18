package pl.familydoctor.family.resource;

import org.springframework.web.bind.annotation.*;
import pl.familydoctor.family.service.PatientService;

import java.util.List;

@CrossOrigin(origins = "http://194.182.71.59:8080")
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
        System.out.println(patientDto.toString());
        patientService.addPatient(patientDto);
    }
}
