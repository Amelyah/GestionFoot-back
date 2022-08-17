package gestionFoot.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Entraineur;

public interface IDAOEntraineur extends JpaRepository<Entraineur, Integer>{

}
