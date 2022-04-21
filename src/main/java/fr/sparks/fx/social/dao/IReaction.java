package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReaction extends JpaRepository<Reaction, Long> {
}
