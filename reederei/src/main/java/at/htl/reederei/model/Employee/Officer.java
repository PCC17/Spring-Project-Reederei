package at.htl.reederei.model.Employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
@Entity

public class Officer extends AEmployee {

    @ManyToMany
    @JoinTable
    private List<CruiseOfficerRole> cruiseOfficerRoles;
}
