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
abstract class commercial extends Employe {
   
    private double chiffreAffaire;
    public commercial (String prenom, String nom, int age, String date,double chiffreAffaire) {
        super(prenom, nom, age, date);
        this.chiffreAffaire=chiffreAffaire;
    }

    /**
     * @return the chiffreAffaire
     */
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    @Override
    public double calculeSalaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
