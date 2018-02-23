package at.htl.reederei.model.Employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Table
@Entity

public class CruiseWaiterRole implements Serializable

    {
        @EmbeddedId
        @NotNull
        private CruiseWaiterRoleID cruiseWaiterRoleID;

        @Column
        private EWaiterRole role;
}
