package fr.sparks.fx.social.business;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dateHeure;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Emotion emotion;
    @ManyToOne
    private Gif gif;
}
