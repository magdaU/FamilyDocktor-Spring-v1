package pl.familydoctor.family.resource;

import lombok.Value;
import pl.familydoctor.family.domain.Sex;

import java.io.Serializable;
import java.util.Date;

@Value
public class PatientDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Sex sex;

}
