package at.htl.reederei.model.Employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Table
@Entity
@NoArgsConstructor
public class CruiseOfficerRole implements Serializable{
    @EmbeddedId
    @NotNull
    private CruiseOfficerRoleID cruiseOfficerRoleID;

    @Column
    private EOfficerRole role;
}
