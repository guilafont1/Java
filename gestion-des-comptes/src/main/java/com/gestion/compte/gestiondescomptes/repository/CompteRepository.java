package com.gestion.compte.gestiondescomptes.repository;

import com.gestion.compte.gestiondescomptes.model.compte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends CrudRepository<compte,Long> {

}
