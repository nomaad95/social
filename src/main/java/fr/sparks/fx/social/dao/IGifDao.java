package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Gif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IGifDao extends JpaRepository<Gif, Long> {

    @Query("FROM Gif g ORDER BY size(g.reactions) DESC")
    List<Gif> gifsByNbReaction();

}
