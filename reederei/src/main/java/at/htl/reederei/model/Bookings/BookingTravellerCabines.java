package at.htl.reederei.model.Bookings;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "BuchungReisendeKabinen")
@Entity
@NoArgsConstructor
public class BookingTravellerCabines implements Serializable {

    @EmbeddedId
    @NotNull
    private BookingTravellerCabinesID bookingTravellerCabinesId;
}
