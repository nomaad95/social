package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUtilisateurDAO extends JpaRepository<Utilisateur, Long> {

    //methode qui renvoit une liste d'utilisateur qui ont le thème en parametre
    @Query("FROM Utilisateur u WHERE u.theme.nom = :theme ")
    List<Utilisateur> findUtilisateurWithSpecificTheme(@Param("theme") String theme);

}
