package pl.familydoctor.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.familydoctor.family.domain.Disease;

import java.util.List;

public interface DiseaseRepository extends JpaRepository<Disease, Long> {

    List<Disease> getAllByPatientId(Long patientId);

    List<Disease> getAllBySymptom(String symptom);

}
