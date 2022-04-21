package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Jour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJour extends JpaRepository<Jour, Long> {
}
