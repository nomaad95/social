package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IThemeDAO extends JpaRepository<Theme, Long> {

    @Query("FROM Theme WHERE nom=:nom")
    Theme findByNomHQL(@Param("nom") String nom);
}
