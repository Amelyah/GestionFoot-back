package gestionFoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur,Integer> {

}
