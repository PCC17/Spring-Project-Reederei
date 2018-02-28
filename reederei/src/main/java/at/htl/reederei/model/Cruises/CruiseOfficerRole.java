package at.htl.reederei.model.Cruises;

import at.htl.reederei.model.Enum.EOfficerRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "Kreuzfahrt_Offizier_Rolle")
@Entity
@NoArgsConstructor
public class CruiseOfficerRole implements Serializable{

    @EmbeddedId
    @NotNull
    private CruiseOfficerRoleID cruiseOfficerRoleID;

    @Column
    private EOfficerRole role;
}
