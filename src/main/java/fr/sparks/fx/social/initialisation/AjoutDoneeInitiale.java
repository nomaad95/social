package fr.sparks.fx.social.initialisation;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import fr.sparks.fx.social.business.Emotion;
import fr.sparks.fx.social.business.Utilisateur;
import fr.sparks.fx.social.dao.IEmotionDAO;
import fr.sparks.fx.social.dao.IUtilisateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.util.*;

@Component
public class AjoutDoneeInitiale implements CommandLineRunner {

    @Autowired
    private IEmotionDAO iEmotionDAO;
    @Autowired
    private IUtilisateurDAO iUtilisateurDAO;

    //Ce constructeur provoque une injection de dépendance
    /*public AjoutDoneeInitiale(IEmotionDAO iEmotionDAO){
        this.iEmotionDAO = iEmotionDAO;
    }*/

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test run ok");
        Emotion emotion = new Emotion("souriant","&#x1F600;");
        Emotion emotion2 = new Emotion("Monocle","&#x1F9D0;");
        Emotion emotion3 = new Emotion("Bisous","&#x1F618;");
        Emotion emotion4 = new Emotion("Coeur","&#x1F923;");


        iEmotionDAO.save(emotion);
        iEmotionDAO.save(emotion2);
        iEmotionDAO.save(emotion3);
        iEmotionDAO.save(emotion4);

        Collection<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
        if(iUtilisateurDAO.count()== 0){
            for(int i=0; i < 10000; i++){
                FakeValuesService fakeValuesService = new FakeValuesService(new Locale("fr-FR"), new RandomService());
                Faker faker = new Faker(new Locale("fr-FR"));
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setNom(faker.name().lastName());
                utilisateur.setPrenom(faker.name().firstName());
                utilisateur.setEmail(fakeValuesService.letterify("?????@sparks.fr"));
                utilisateur.setMotDePasse(fakeValuesService.letterify("?????"));
                Calendar calendar = Calendar.getInstance();
                calendar.set(2021, 1, 1);
                Date dateDebut = calendar.getTime();
                calendar = Calendar.getInstance();
                Date dateFin = calendar.getTime();
                Date dateAleatoire = faker.date().between(dateDebut, dateFin);
                calendar.setTime(dateAleatoire);
                utilisateur.setDateHeureInscription(dateAleatoire.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
                Random random = new Random();
                utilisateurs.add(utilisateur);

            }

        }
        iUtilisateurDAO.saveAll(utilisateurs);
        System.out.println("ajout des 10 000 utilisateurs");


    }



}
