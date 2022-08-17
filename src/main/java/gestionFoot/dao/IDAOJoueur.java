package gestionFoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Joueur;

public interface IDAOJoueur extends JpaRepository<Joueur,Integer> {

}
