package at.htl.reederei.model.Employee;

import at.htl.reederei.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@DiscriminatorColumn
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class AEmployee extends AEntity {

    @Column
    @NotNull
    private String firstName;

    @Column
    @NotNull
    private String lastName;
}
