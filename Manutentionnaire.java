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
public class Manutentionnaire extends Employe{
     private final static double SALAIRE_HORAIRE=65.0;
      private final static int SALAIRE_DE_BASE=110000;
     private int heures;

    public Manutentionnaire(String prenom, String nom, int age, String date,int heures) {
        super(prenom, nom, age, date);
        this.heures=heures;
    }

    @Override
    public double calculeSalaire() {
       return SALAIRE_HORAIRE*heures + SALAIRE_DE_BASE;
    }

    /**
     *
     * @return
     */
    @Override
    public String getTitre(){
        return "Le Manutentionnaire";
    }
}
