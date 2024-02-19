package com.gestion.compte.gestiondescomptes.repository;

import com.gestion.compte.gestiondescomptes.model.compte;
import org.springframework.data.repository.CrudRepository;

public interface CompteRepository extends CrudRepository<compte,Long> {

}
