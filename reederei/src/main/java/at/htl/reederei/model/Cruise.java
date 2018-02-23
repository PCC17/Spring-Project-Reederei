package at.htl.reederei.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Cruise extends AEntity {

  /*  @EmbeddedId
    @NotNull
    @Min(3)
    private List<CruisePartialRoute> cruisePartialRoutes;*/

    @Column(nullable = false)
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
