package fr.sparks.fx.social.business;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public abstract class Gif {

    @Id
    protected Long id;
    protected LocalDateTime dateHeureAjout;
    protected String legende;
    @OneToOne
    protected Jour jour;
    @OneToMany(mappedBy = "gif")
    protected Collection<Reaction> reactions;
    @ManyToOne
    private Utilisateur utilisateur;

    public Gif() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateHeureAjout() {
        return dateHeureAjout;
    }

    public void setDateHeureAjout(LocalDateTime dateHeureAjout) {
        this.dateHeureAjout = dateHeureAjout;
    }

    public String getLegende() {
        return legende;
    }

    public void setLegende(String legende) {
        this.legende = legende;
    }

    public Jour getJour() {
        return jour;
    }

    public void setJour(Jour jour) {
        this.jour = jour;
    }

    public Collection<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(Collection<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
