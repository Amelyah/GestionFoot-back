package gestionFoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionFoot.model.Gardien;

public interface GardienRepository  extends JpaRepository<Gardien, Integer> {

}
