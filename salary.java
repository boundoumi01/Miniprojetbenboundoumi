
import com.minprojet.classi.Personnel;
import com.minprojet.classi.Technicien;
import com.minprojet.classi.Vendeur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Boundoumi
 */
public class salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnel p=new Personnel(); 
        p.ajouterEmploye(new Vendeur(" ben "," Busines ",45," 1992 ",30000));
         p.ajouterEmploye(new Technicien(" boundoumi "," electricien ",45," 2000 ",43000));
        p.afficherSalire();
        System.out.println("Le salaire moyen dans l'entreprise est de " +p.salaireMoyen());
    }
    
}
