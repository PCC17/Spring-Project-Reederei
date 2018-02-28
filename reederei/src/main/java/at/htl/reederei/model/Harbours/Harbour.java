package at.htl.reederei.model.Harbours;

import at.htl.reederei.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Table(name = "Hafen")
@Entity
@Setter
public class Harbour extends AEntity {


    @Max(100)
    @Column(length = 100, nullable = false, unique = true)
    @NotNull
    private String name;

    @Max(20)
    @Column(length = 20, nullable = false)
    @NotNull
    private String location;

    @Max(40)
    @Column(length = 40, nullable = false)
    @NotNull
    private String country;

    @Max(20)
    @Column(length = 20, nullable = false)
    @NotNull
    private String continent;
}

