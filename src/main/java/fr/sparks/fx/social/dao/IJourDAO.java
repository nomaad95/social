package fr.sparks.fx.social.dao;

import fr.sparks.fx.social.business.Jour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface IJourDAO extends JpaRepository<Jour, Long> {

    @Query("FROM Jour WHERE month(date)=month(current_date()) AND year(date)=year(current_date())")
    List<Jour> finDaysOfCurrentMonth();

    List<Jour> findByDateBetween(LocalDate dateDebut, LocalDate dateFin);

}
