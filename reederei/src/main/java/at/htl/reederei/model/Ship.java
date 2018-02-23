package at.htl.reederei.model;

import at.htl.reederei.model.Employee.Officer;
import at.htl.reederei.model.Employee.Waiter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Table
@Entity


public class Ship extends AEntity {

    @Column
    @NotNull
    private String name;

    @Column(unique = true)
    @NotNull
    private String identificationNumber;

    @Column
    @OneToMany
    @Min(10)
    @Max(600)
    private List<Cabine> cabines;

    @Column
    @ManyToMany
    @Min(3)
    private List<Officer> officers;

    @Column
    @ManyToMany
    private List<Waiter> waiters;
}
