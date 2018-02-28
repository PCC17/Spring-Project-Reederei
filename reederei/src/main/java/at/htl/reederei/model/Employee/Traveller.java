package at.htl.reederei.model.Employee;

import at.htl.reederei.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Reisende")
public class Traveller extends AEntity {

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Temporal(TemporalType.DATE)
    @Column
    @NotNull
    private Date birthdate;


}
