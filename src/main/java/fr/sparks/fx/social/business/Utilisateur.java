package fr.sparks.fx.social.business;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    //@Transactional(readOnly = true)
    private static final int NB_POINTS_INITIAL = 500;
    private String nom;
    @Column(length = 30)
    private String prenom;
    //@Column(unique = true)
    private String email;
    private String motDePasse;
    private int nbPoints;
    private LocalDateTime dateHeureInscription;
    @ManyToOne
    private Theme theme;
    @OneToMany(mappedBy = "utilisateur")
    private Collection<Gif> gifs;
    @OneToMany
    @JoinTable(name = "abonnementUtilisateur")
    private Collection<Abonnement> abonnements;

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public LocalDateTime getDateHeureInscription() {
        return dateHeureInscription;
    }

    public void setDateHeureInscription(LocalDateTime dateHeureInscription) {
        this.dateHeureInscription = dateHeureInscription;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Collection<Gif> getGifs() {
        return gifs;
    }

    public void setGifs(Collection<Gif> gifs) {
        this.gifs = gifs;
    }

    public Collection<Abonnement> getAbonnements() {
        return abonnements;
    }

    public void setAbonnements(Collection<Abonnement> abonnements) {
        this.abonnements = abonnements;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "prenom=" + prenom +
                ", nom=" + nom +
                '}';
    }
}
