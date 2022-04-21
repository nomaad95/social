package fr.sparks.fx.social.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Theme {

    @Id
    private Long id;

    private String nom;
}
