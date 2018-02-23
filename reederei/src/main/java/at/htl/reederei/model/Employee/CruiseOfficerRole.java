package at.htl.reederei.model.Employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Table
@Entity

public class CruiseOfficerRole implements Serializable{
    @EmbeddedId
    @NotNull
    private CruiseOfficerRoleID cruiseOfficerRoleID;

    @Column
    private EOfficerRole role;
}
