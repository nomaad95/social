package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Emotion;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface IEmotionDAO extends JpaRepository<Emotion, Long> {
}
