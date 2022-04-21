package fr.sparks.fx.social.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Emotion {

    @Id
    private Long id;
    private String nom;
    private String code;
    @OneToMany(mappedBy = "emotion")
    private Collection<Reaction> reation;
    @ManyToOne
    private Emotion emotion;

    public Emotion(String nom, String code) {
        this.nom = nom;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Collection<Reaction> getReation() {
        return reation;
    }

    public void setReation(Collection<Reaction> reation) {
        this.reation = reation;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }
}
