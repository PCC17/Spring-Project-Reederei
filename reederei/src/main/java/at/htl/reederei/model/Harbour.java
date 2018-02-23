package at.htl.reederei.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Table
@Entity

@Setter
public class Harbour extends AEntity{
    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String land;

    @Column
    @NotNull
    private String continent;
}

