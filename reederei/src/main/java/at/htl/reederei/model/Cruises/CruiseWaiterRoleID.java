package at.htl.reederei.model.Cruises;

import at.htl.reederei.model.Cruises.Cruise;
import at.htl.reederei.model.Employee.Waiter;

import javax.persistence.*;
import java.io.Serializable;

public class CruiseWaiterRoleID implements Serializable {

    @JoinColumn(nullable = false, updatable = false)
    @ManyToOne
    private Cruise cruise;



    @JoinColumn(nullable = false, updatable = false)
    @ManyToOne
    private Waiter waiter;


}
