
package utilitaire;
import javax.swing.*;



public class Utilitaire {
    
//méthode pour valider si certain champ type JTextField est vide
    public static boolean estVide(JTextField champ){
        return champ.getText().isEmpty();
    }

//méthode pour valider si certain champ est negative
    public static boolean estNegative(JTextField champ){
        return (Double.parseDouble(champ.getText())<0);
    }
//méthode pour valider si certain champ est zéro
    public static boolean estZero(JTextField champ){
        return champ.getText().equals("0");
    }
    
//méthode pour valider si certain champ n'est pas ni vide ni negative
//On va utiliser les méthodes déjà définis dans la classe
    public static boolean nonVideNegative(JTextField champ){
        if (estVide(champ)){
            return false;
        } else if (estNegative(champ)){
            return false;
        } else {
            return true;
        }
    }
    
//méthode pour effacer un champ de type JTextField
    public static void effacerChamp(JTextField champ){
        champ.setText("");
    }
    
//méthode pour effacer un champ de type JLabel
    public static void effacerChamp(JLabel label){
        label.setText("");
    }
    
}
