package gestionFoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne,Integer> {

}
