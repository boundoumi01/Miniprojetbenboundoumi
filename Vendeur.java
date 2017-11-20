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
public class Vendeur extends commercial {
    private final static double POURCENT_VENDEUR=0.2;
     private final static double BONUS_VENDEUR=100;
     private final static int SALAIRE_DE_BASE=110000;
     

    public Vendeur(String prenom, String nom, int age, String date, double chiffreAffaire) {
        super(prenom, nom, age, date, chiffreAffaire);
    }
    @Override
   public double calculeSalaire(){
       return(POURCENT_VENDEUR*getChiffreAffaire())+BONUS_VENDEUR+ SALAIRE_DE_BASE;
   }

    /**
     *
     * @return chaine de caractere
     */
    @Override
   public String getTitre()
   {
       return"Le vendeur";
   }
}
