package at.htl.reederei.model.PartialRoutes;

import at.htl.reederei.model.AEntity;
import at.htl.reederei.model.Harbours.Harbour;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name  = "Teilstrecke")
public class PartialRoute extends AEntity {

    @OneToOne
    @JoinColumn(name= "startHafen")
    @NotNull
    private Harbour beginHarbour;

    @OneToOne
    @NotNull
    @JoinColumn(name = "endHafen")
    private Harbour endHarbour;

    @Column(length = 40, unique = true, nullable = false)
    @NotNull
    private String description;

}
