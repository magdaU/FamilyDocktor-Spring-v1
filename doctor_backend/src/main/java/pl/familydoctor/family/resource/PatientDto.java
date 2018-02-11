package pl.familydoctor.family.resource;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PatientDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String sex;

}
