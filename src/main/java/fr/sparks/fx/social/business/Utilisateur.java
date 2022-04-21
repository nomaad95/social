package fr.sparks.fx.social.business;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public class Utilisateur {

    @Id
    private Long id;
    //@Transactional(readOnly = true)
    private static final int NB_POINTS_INITIAL = 500;
    private String nom;
    @Column(length = 30)
    private String prenom;
    @Column(unique = true)
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
}
