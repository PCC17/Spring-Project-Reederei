package at.htl.reederei.model.Employee;

import at.htl.reederei.model.Cruises.CruiseOfficerRole;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "Offizier")
@Entity

public class Officer extends AEmployee {

    @Column
    private CruiseOfficerRole cruiseOfficerRoles;
}
