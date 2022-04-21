package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Emotion;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IEmotionDAO extends JpaRepository<Emotion, Long> {

    @Query("FROM Emotion WHERE nom LIKE 'S%'")
    List<Emotion> findNameStartingWithS();
}
