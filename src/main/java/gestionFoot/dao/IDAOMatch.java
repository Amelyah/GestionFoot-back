package gestionFoot.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Match;

public interface IDAOMatch extends JpaRepository<Match,Integer> {

}
