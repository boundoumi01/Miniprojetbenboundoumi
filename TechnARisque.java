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
public class TechnARisque extends Technicien implements ARisque{

    public TechnARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
    }
    @Override
    public double calculeSalaire(){
        return super.calculeSalaire() + PRIME;
    }
}
