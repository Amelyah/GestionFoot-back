package gestionFoot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestionFoot.model.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
	
	@Query("Select equipe from Equipe equipe join fetch equipe.listJoueur where equipe.id=:id")
//	SELECT c from Competition c join fetch c.participants where c.id=:id
	public Optional<Equipe> findEquipeWithJoueur(@Param("id") Integer  id);
	
}
