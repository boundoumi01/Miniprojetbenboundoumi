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
public class ManutARisque extends Manutentionnaire implements ARisque{

    public ManutARisque(String prenom, String nom, int age, String date, int heures) {
        super(prenom, nom, age, date, heures);
    }
    @Override
    public double calculeSalaire(){
        return super.calculeSalaire()+PRIME;
    }
}
