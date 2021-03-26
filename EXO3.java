/**
 * Exercice 3 Saisir une date (jj-mm-aaaa) puis determiner si la date est valide
 * ou pas 1- pas de classe de java 2- Faire avec les classes Java
 */

import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;
public class EXO3 {
    
    /*****SANS FONCTION**********/
    public static void main(String[] args){
        /**SANS LES CLASSES DE JAVA */
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Entrer le num du jour : ");
        int j=sc.nextInt();
        System.out.println("Entrer le num du mois : ");
        int a = sc.nextInt();
        System.out.println("Entrer le num de l'annee : ");
        int m = sc.nextInt();
      
        if (j<1 || j>7 || m<1 || m>12) {
            System.out.println("Cette date n'esxiste pas");
            
        } else {
            System.out.println(j+" / "+m+" / "+a+" est une date qui exciste" );
        }
        
    
    /**AVEC LES CLASSES DE JAVA */

       
     temp();
       
    }
    /********AVEC FONCTION******/
    private static void temp() {
       try( Scanner sc = new Scanner(System.in)){;
        System.out.println("Entrer le  jour : ");
        int j = sc.nextInt();
        System.out.println("Entrer le num du mois : ");
        int m = sc.nextInt();
        System.out.println("Entrer le num de l'annee : ");
        int a = sc.nextInt();
        YearMonth yM = YearMonth.of(a, m); 

        if (j <= 1 || j >= 30 || m <= 1 || m >= 12) {
            System.out.println(j + " / " + m + " / " + a + " est une date qui n'existe pas");
       return ;
        
    } else {
        System.out.println(j + " / " + m + " / " + a + " est une date qui existe");
        return;
        }
    }
    }
    

}
