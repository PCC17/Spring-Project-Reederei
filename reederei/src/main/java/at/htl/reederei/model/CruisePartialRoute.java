package at.htl.reederei.model;

import at.htl.reederei.model.Employee.CruiseWaiterRoleID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Table
@Getter
@Setter
public class CruisePartialRoute implements Serializable{
    @NotNull
    @EmbeddedId
    private CruiseWaiterRoleID cruiseWaiterRoleID;
}
