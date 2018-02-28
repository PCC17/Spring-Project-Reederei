package at.htl.reederei.model.Ships;

import at.htl.reederei.model.AEntity;
import at.htl.reederei.model.Cabines.Cabine;
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
@Table(name = "Schiff")
@Entity

public class Ship extends AEntity {

    @Column
    @NotNull
    private String name;

    @Max(10)
    @Column(length = 10, nullable = false, unique = true)
    @NotNull
    private String identificationNumber;

    @JoinColumn
    @OneToMany
    @Min(10)
    @Max(600)
    private List<Cabine> cabines;


    @JoinTable
    @ManyToMany
    @Min(3)
    private List<Officer> officers;

    @JoinTable
    @ManyToMany
    private List<Waiter> waiters;
}
