package pl.familydoctor.family.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Patient extends BaseEntity {

    private String firstName;

    private String lastName;

    private Date birthDate;

    private Sex sex;
}
