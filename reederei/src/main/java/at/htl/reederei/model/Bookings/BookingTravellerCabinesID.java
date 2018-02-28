package at.htl.reederei.model.Bookings;

import at.htl.reederei.model.Cabines.Cabine;
import at.htl.reederei.model.Employee.Traveller;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


public class BookingTravellerCabinesID implements Serializable {

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Traveller traveller;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Cabine cabines;
}
