package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Gif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGifDao extends JpaRepository<Gif, Long> {
}
