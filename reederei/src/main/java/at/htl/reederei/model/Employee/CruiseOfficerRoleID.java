package at.htl.reederei.model.Employee;

import at.htl.reederei.model.Cruise;

import javax.persistence.*;

public class CruiseOfficerRoleID {
    @JoinColumn(nullable = false, updatable = false)
    @ManyToOne
    private Cruise cruise;



    @JoinColumn(nullable = false, updatable = false)
    @ManyToOne
    private Officer officer;
}
