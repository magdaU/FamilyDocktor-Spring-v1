package pl.familydoctor.family.resource.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DiseaseDto {

    private Long id;

    private String symptom;

    private String diagnosis;

    private Boolean isDoctorDiagnosis;

    private Date diseaseStartDate;

    private Date diseaseEndDate;

    private Long patientId;
}
