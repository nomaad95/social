package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITheme extends JpaRepository<Theme, Long> {
}
