package pl.familydoctor.family.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "patient")
@ToString
@EqualsAndHashCode
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;

    @Version
    @Setter
    @Getter
    private Long version;

    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;

    @Setter
    @Getter
    private Date birthDate;

    @Setter
    @Getter
    private Sex sex;
}
