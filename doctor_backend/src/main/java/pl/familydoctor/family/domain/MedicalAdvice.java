package pl.familydoctor.family.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class MedicalAdvice extends BaseEntity {

    private boolean doctorAdvice;

    private String comment;

    @OneToMany
    @JoinColumn(name = "medical_advice_id")
    private List<Treatment> treatments;

}
