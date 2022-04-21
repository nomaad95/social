package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateurDAO extends JpaRepository<Utilisateur, Long> {


}
