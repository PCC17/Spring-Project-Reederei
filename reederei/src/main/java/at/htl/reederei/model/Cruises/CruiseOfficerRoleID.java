package at.htl.reederei.model.Cruises;

import at.htl.reederei.model.Cruises.Cruise;
import at.htl.reederei.model.Employee.Officer;

import javax.persistence.*;
import java.io.Serializable;

public class CruiseOfficerRoleID implements Serializable {

    @JoinColumn(nullable = false, updatable = false)
    @ManyToOne
    private Cruise cruise;

    @JoinColumn(nullable = false, updatable = false)
    @ManyToOne
    private Officer officer;
}
