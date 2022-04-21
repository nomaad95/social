package fr.sparks.fx.social.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Abonnement {

    @Id
    private Long id;
    private String nom;
    @ManyToMany(mappedBy = "abonnements")
    private Collection<Utilisateur> utilisateurs;

}
