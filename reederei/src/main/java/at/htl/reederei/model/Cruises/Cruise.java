package at.htl.reederei.model.Cruises;

import at.htl.reederei.model.AEntity;
import at.htl.reederei.model.Ships.Ship;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name  = "Kreuzfahrt")
public class Cruise extends AEntity {

    @NotNull
    @Max(20)
    @Column(length = 20, nullable = false)
    private String name;

    @Column
    @NotNull
    private Ship ship;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date begin;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date end;
}
