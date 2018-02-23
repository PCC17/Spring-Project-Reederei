package at.htl.reederei.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Table
@Entity

public class ShipHarbour implements Serializable {

    @EmbeddedId
    @NotNull
    private ShipHarbourID shipHarbourID;

    @Column
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private EMovement movement;
}
