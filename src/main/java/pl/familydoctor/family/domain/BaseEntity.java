package pl.familydoctor.family.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long version;
}
