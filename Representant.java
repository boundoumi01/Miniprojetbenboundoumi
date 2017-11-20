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
public class Representant extends commercial {
    private final static double POURCENT_REPRESENTANT=0.2;
     private final static int BONUS_REPRESENTANT=200;
      private final static int SALAIRE_DE_BASE=110000;

    public Representant(String prenom, String nom, int age, String date, double chiffreAffaire) {
        super(prenom, nom, age, date, chiffreAffaire);
    }
    public double calculeSalaire(){
        return(POURCENT_REPRESENTANT*getChiffreAffaire())+BONUS_REPRESENTANT+SALAIRE_DE_BASE;
        
                
    }
    public String getTile()
    {
        return"Le représentant";
    }
    
}
