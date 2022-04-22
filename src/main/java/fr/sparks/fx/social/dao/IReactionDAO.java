package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Gif;
import fr.sparks.fx.social.business.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IReactionDAO extends JpaRepository<Reaction, Long> {

    List<Reaction> findLast5ByGif(Gif gif);
    /*
    @Query("FROM Reaction r WHERE r.gif=:gif ORDER BY r.gif.jour DESC LIMIT 5")
    List<Reaction> findLast5ByGifQ(@Param("gif") Gif gif);*/
}
