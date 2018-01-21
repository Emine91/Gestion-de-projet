package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TacheRepository extends CrudRepository<Tache, Long> {
List<Tache> findByIdtache(int idtache);
	Iterable<Tache> findAll();
@Modifying
@Query("Update Tache t SET t.etattache=:etattache WHERE t.idtache=:idtache")
@Transactional
public void updateEtat_tache(@Param("idtache") int idtache, @Param("etattache") String etattache);
}