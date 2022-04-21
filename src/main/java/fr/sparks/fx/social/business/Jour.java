package fr.sparks.fx.social.business;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Jour {
    @Id
    private LocalDate date;
    private int nbPoints;
    @OneToOne
    private Gif gif;

}
