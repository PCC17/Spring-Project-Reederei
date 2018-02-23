package at.htl.reederei.model.Employee;

import at.htl.reederei.model.AEntity;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AEmployee extends AEntity {

    @Column
    @NotNull
    private String firstName;

    @Column
    @NotNull
    private String lastName;
}
