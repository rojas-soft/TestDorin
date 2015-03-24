/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package traitement;
import javax.swing.*;

public class Traitement {

    //méthode pour calculer le IMC
    public static double calculerIMC(JTextField vPoids, JTextField vTaille){
        double poids = Double.parseDouble(vPoids.getText());
        double taille = Double.parseDouble(vTaille.getText());
        double tailleM = taille/100;
        //double imc = (poids / (tailleM * tailleM)); 
        //return imc;
        return (poids / (tailleM * tailleM));
    }
    
   //méthode pour classifier le niveau du risque pour la santée
    public static void classifier(JLabel lblRisque, double imc){
        String descriptionRisque = "";
        if (imc < 18.5){
            descriptionRisque = "Accru";
        } else if (imc <= 24.9) {
            descriptionRisque = "Moindre";
        } else if (imc <= 29.9) {
            descriptionRisque = "Accru";
        } else if (imc <= 34.9) {
            descriptionRisque = "Élevé";
        } else if (imc <= 39.9) {
            descriptionRisque = "Très élevé";
        } else {
            descriptionRisque = "Extrêmement élevé";
        }
        lblRisque.setText(descriptionRisque);
    }
    
}
