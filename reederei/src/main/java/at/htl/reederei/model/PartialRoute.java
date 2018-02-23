package at.htl.reederei.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table
public class PartialRoute extends AEntity{

    @Column
    private Harbour beginHarbour;

    @Column
    private Harbour endHarbour;

    @Column
    private String description;

}
