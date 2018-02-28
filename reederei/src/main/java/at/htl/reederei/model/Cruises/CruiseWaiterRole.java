package at.htl.reederei.model.Cruises;

import at.htl.reederei.model.Enum.EWaiterRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "Kreuzfahrt_Service_Rolle")
@Entity
@NoArgsConstructor
public class CruiseWaiterRole implements Serializable

    {
        @EmbeddedId
        @NotNull
        private CruiseWaiterRoleID cruiseWaiterRoleID;

        @Enumerated(EnumType.STRING)
        @Column
        private EWaiterRole role;
}
