package at.htl.reederei.model.Employee;

import at.htl.reederei.model.Cruise;

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
