package pl.familydoctor.family.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Disease extends BaseEntity {

    private String symptom;

    private String diagnosis;

    private Date symptomDate;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany
    @JoinColumn(name = "disease_id")
    private List<MedicalAdvice> medicalAdvices;

    public void addMedicalAdvice(MedicalAdvice medicalAdvice) {
        if (medicalAdvices == null) {
            medicalAdvices = new ArrayList<>();
        }
        medicalAdvices.add(medicalAdvice);
    }
}
