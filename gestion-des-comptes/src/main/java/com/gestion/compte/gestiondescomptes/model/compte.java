package com.gestion.compte.gestiondescomptes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity

public class compte {
    @Id
    @GeneratedValue
    private long id;
    private int numeroCompte;
    private double solde;
    private LocalDate dateOuverture;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public LocalDate getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(LocalDate dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
}
