package at.htl.reederei.model.Bookings;

import at.htl.reederei.model.AEntity;
import at.htl.reederei.model.Cruises.Cruise;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "Buchung")
public class Booking extends AEntity {

    @Column
    private Integer price;

    @Column
    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    @NotNull
    @Column
    private Cruise cruise;
}
