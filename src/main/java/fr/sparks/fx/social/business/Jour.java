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

    @Override
    public String toString() {
        return "Jour{" +
                "date=" + date +
                ", nbPoints=" + nbPoints +
                '}';
    }

    @OneToOne
    private Gif gif;

}
