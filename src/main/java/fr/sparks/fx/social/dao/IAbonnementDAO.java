package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAbonnementDAO extends JpaRepository<Abonnement, Long> {
}
