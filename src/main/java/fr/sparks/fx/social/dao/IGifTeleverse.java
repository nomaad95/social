package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.GifTeleverse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGifTeleverse extends JpaRepository<GifTeleverse, Long> {
}
