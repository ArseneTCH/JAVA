/*Saisir une année et un mois 
  puis determiner le nombre de jour de ce mois
  dans l'année
    1- pas de classe de java 
    2- Faire avec les classes Java 
  */
 /*******SANS FONCTION************ */

    import java.util.Scanner;
    import java.time.Year;
    import java.time.Month;

class EXO2 {
   public static void main(String[] args) {
       /* try(Scanner sc=new Scanner(System.in)){
        System.out.print("Entrer l'annee : ");
        int a=sc.nextInt();
        System.out.print("Entrer le num du mois: ");
        int m=sc.nextInt();

/******SANS LES CLLASSES DE JAVA ******/

       /*if (a%4==0 && m==2) {
      System.out.println("ce moi compte "+29+" jours");
       }else if (a%4!=0 && m==2) {
          System.out.println("ce moi compte "+28+" jours");
       }else if (m==4 || m==6  ||m==5 || m==9 ||
        m==11) {
         System.out.println("ce moi compte "+30+" jours");
       }else{
        System.out.println("ce moi compte "+31+" jours");
       };
      };  */
      moiss();

      /*******AVEC LES CLASSES DE JAVA********/

          /*  Month mois=Month.of(m);
            Year y=Year.of(a);
            System.out.println("le mois compte: "+ mois.length(isLeap(y)));
   };*/
}

  /* private static boolean isLeap(Year of) {
      return false;
   }*/

/**************AVEC FONCTION ***************/
     
private static String moiss() {
      try(Scanner sc=new Scanner(System.in)){
        System.out.print("Entrer l'annee : ");
        int a=sc.nextInt();
        System.out.print("Entrer le num du mois: ");
        int m=sc.nextInt();

        /******SANS AVEC LES CLASSES DE JAVA *****/

     /*   if (a%4==0 && m==2) {
      return("ce moi compte "+29+" jours");
       }else if (a%4!=0 && m==2) {
          return("ce moi compte "+28+" jours");
       }else if (m==4 || m==6  ||m==5 || m==9 ||
        m==11) {
         return("ce moi compte "+30+" jours");
       }else{
        return("ce moi compte "+31+" jours");
       }
       */

       /******AVEC LES CLASSES DE JAVA *****/

       Month mois = Month.of(m);
       Year y = Year.of(a);
       return("le mois compte: " + mois.length(isLeap(y)));
      }
   }
private static boolean isLeap(Year y) {
   return false;
}


};
   

   
