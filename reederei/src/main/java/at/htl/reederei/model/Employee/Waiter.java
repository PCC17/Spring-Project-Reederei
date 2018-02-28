package at.htl.reederei.model.Employee;

import at.htl.reederei.model.Cruises.CruiseWaiterRole;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "Service")
@Entity

public class Waiter extends AEmployee {

    @Column
    private CruiseWaiterRole cruiseWaiterRoles;
}
