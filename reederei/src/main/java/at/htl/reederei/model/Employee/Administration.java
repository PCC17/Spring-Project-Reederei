package at.htl.reederei.model.Employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "Verwaltung")
@Entity
public class Administration extends AEmployee {
}
