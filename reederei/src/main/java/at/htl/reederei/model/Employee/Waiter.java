package at.htl.reederei.model.Employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
@Entity

public class Waiter extends AEmployee {

    @ManyToMany
    @JoinTable
    private List<CruiseWaiterRole> cruiseWaiterRoles;
}
