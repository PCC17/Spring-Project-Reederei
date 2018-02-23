package at.htl.reederei.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Getter
@NoArgsConstructor
@Embeddable
@AllArgsConstructor
public class CruisePartialRouteID implements Serializable {

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Cruise cruise;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private PartialRoute partialRoute;
}
