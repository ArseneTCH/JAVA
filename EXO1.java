/*
     * A faire sans fonction et avec fonction
     * 
     * Exercice 1 Saisir une année qui est un entier positif puis determiner si
     * l'année est bisextile ou pas
     */
/*
 * EXO1
 */
                    /********SANS FONCTION ****************/
        import java.util.Scanner;
        import java.time.Year;
        
        public class EXO1{
        public static void main(String[] args){
           /* Scanner sc =new Scanner(System.in) ;
            System.out.print("Entrer l'année: ");
            int x = sc.nextInt();
            
            Year year = Year.of(x);
            System.out.println("Dire que " + x + " est une année bisextile est " + year.isLeap());
        
            
        };*/

        bool();
    };
    
                  /************* AVEC FONCTION *************/
        
        private static void bool() {
             Scanner sc=new Scanner(System.in);
                     System.out.print("Entrer l'année: ");
                     int x=sc.nextInt();
                     Year y=Year.of(x);
                     System.out.println("Dire que " + x + " est une année bisextile est " + y.isLeap());
        }
            
        };
    
    