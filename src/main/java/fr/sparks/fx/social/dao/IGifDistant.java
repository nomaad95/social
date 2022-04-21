package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.GifDistant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGifDistant extends JpaRepository<GifDistant, Long> {
}
