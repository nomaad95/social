package fr.sparks.fx.social.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
public abstract class Gif {

    @Id
    protected Long id;
    protected LocalDateTime dateHeureAjout;
    protected String legende;
    @OneToOne
    protected Jour jour;
    @ManyToOne
    protected Reaction reaction;
    @ManyToOne
    private Utilisateur utilisateur;
}
