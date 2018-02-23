package at.htl.reederei.model.Employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Table
@Entity

public class Waiter extends AEmployee {
    @Column
    private List<CruiseWaiterRole> cruiseWaiterRoles;
}
