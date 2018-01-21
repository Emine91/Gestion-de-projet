package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProjetRepository extends CrudRepository<Projet, Long> {
List<Projet> findByIdprojet(int idprojet);

	Iterable<Projet> findAll();
	@Modifying
	@Query("Update Projet p SET p.etatprojet=:etatprojet WHERE p.idprojet=:idprojet")
	@Transactional
	public void updateEtatprojet(@Param("idprojet") int idprojet, @Param("etatprojet") String etatprojet);

}

