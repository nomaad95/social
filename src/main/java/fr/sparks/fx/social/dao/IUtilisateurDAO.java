package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Utilisateur;
import fr.sparks.fx.social.util.NbInscrits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUtilisateurDAO extends JpaRepository<Utilisateur, Long> {

    //methode qui renvoit une liste d'utilisateur qui ont le thème en parametre
    @Query("FROM Utilisateur u WHERE u.theme.nom = :theme ")
    List<Utilisateur> findUtilisateurWithSpecificTheme(@Param("theme") String theme);

    /*@Query("From Utilisateur u, Reaction r join r.utilisateur = u AND count(r.utilisateur) >=5")
    List<Utilisateur> findUtilisateurAtLeast5Reactions();*/

    /**
     * Cette méthode renvoie le nombre d'inscrits par année et par mois
     * Elle utilise la classe util NbInscrits
     */
    @Query(value="SELECT new fr.sparks.fx.social.util.NbInscrits(year(utilisateur.dateHeureInscription), " +
            "month(utilisateur.dateHeureInscription), count(utilisateur)) FROM Utilisateur utilisateur " +
            "GROUP BY year(utilisateur.dateHeureInscription), " +
            "month(utilisateur.dateHeureInscription) " +
            "ORDER BY year(utilisateur.dateHeureInscription) desc, month(utilisateur.dateHeureInscription)")
    List<NbInscrits> findNbInscrits();

}
