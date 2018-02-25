package pl.familydoctor.family.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Treatment extends BaseEntity{

    private String frequency;

    private Date dosageFromDate;

    private Date dosageToDate;

    private String drugName;

    private String comment;
}
