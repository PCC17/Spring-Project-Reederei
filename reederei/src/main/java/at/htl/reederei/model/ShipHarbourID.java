package at.htl.reederei.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Getter
@NoArgsConstructor
@Embeddable
@AllArgsConstructor
public class ShipHarbourID {

    @ManyToMany
    @JoinColumn(nullable = false, updatable = false)
    private Ship ship;
    @ManyToMany
    @JoinColumn(nullable = false, updatable = false)
    private Harbour harbour;
}
