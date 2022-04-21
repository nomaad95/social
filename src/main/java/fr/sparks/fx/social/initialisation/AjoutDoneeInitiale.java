package fr.sparks.fx.social.initialisation;

import fr.sparks.fx.social.business.Emotion;
import fr.sparks.fx.social.dao.IEmotionDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AjoutDoneeInitiale implements CommandLineRunner {

    private IEmotionDAO iEmotionDAO;

    //Ce constructeur provoque une injection de dépendance
    public AjoutDoneeInitiale(IEmotionDAO iEmotionDAO){
        this.iEmotionDAO = iEmotionDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test run okt");
        Emotion emotion = new Emotion("souriant","&#x1F600;");
        iEmotionDAO.save(emotion);
    }
}
