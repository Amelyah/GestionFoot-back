package gestionFoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Equipe;

public interface IDAOEquipe extends JpaRepository<Equipe,Integer> {

}
