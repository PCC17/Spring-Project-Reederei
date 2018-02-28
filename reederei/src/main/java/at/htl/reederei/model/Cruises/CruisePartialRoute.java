package at.htl.reederei.model.Cruises;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name  = "Kreuzfahrt_Teilstrecke")
@Getter
@Setter
@NoArgsConstructor
public class CruisePartialRoute implements Serializable{

    @NotNull
    @EmbeddedId
    private CruisePartialRouteID cruisePartialRouteID;
}
