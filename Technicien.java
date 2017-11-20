/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.minprojet.classi;

/**
 *
 * @author Boundoumi
 */
public class Technicien extends Employe{
    private final static double FACTEUR_UNITE=5;
     private final static int SALAIRE_DE_BASE=110000;
     private int unites;

    public Technicien(String prenom, String nom, int age, String date,int unites) {
        super(prenom, nom, age, date);
        this.unites=unites;
    }

    @Override
    public double calculeSalaire() {
        return FACTEUR_UNITE*unites+SALAIRE_DE_BASE;
    }
    
    @Override
    public String getTitre(){
        return"Le technicien";
    }
}
