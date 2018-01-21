package pl.familydoctor.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.familydoctor.family.domain.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
}

