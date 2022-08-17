package gestionFoot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Match;

public interface MatchRepository extends JpaRepository<Match,Integer> {

}
