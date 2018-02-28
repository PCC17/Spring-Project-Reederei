package at.htl.reederei.model.Ships;

import at.htl.reederei.model.Harbours.Harbour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Embeddable
@AllArgsConstructor
public class ShipHarbourID implements Serializable {

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Ship ship;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Harbour harbour;
}
