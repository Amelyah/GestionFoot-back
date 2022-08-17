package gestionFoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Personne;

public interface IDAOPersonne extends JpaRepository<Personne,Integer> {

}
