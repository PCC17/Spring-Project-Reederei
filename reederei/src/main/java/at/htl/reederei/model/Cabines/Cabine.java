package at.htl.reederei.model.Cabines;

import at.htl.reederei.model.AEntity;
import at.htl.reederei.model.Enum.ECabineSize;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Table(name = "Kabine")
@Entity

public class Cabine extends AEntity {

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private ECabineSize cabineSize;
}
