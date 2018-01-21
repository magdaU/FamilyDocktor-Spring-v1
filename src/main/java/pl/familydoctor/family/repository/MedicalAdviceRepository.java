package pl.familydoctor.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.familydoctor.family.domain.MedicalAdvice;


public interface MedicalAdviceRepository extends JpaRepository<MedicalAdvice, Long> {
}

