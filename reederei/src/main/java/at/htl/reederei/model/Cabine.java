package at.htl.reederei.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Table
@Entity

public class Cabine extends AEntity{

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private ECabineSize cabineSize;
}
