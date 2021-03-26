/**Exercice 4
  Saisir une date puis determiner la date suivante puis la date precedente 
    1- pas de classe de java 
    2- Faire avec les classes Java 
 */

import java.time.LocalDate;
import java.util.Scanner;
/*******SANS FONCTION*********** */
class EXO4 {
    public static void main(String[] args) {
        /*******SANS CLASSES DE JAVA*****/

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le num du jour : ");
        int j = sc.nextInt();
        System.out.println("Entrer le num du mois : ");
        int m = sc.nextInt();
        System.out.println("Entrer le num de l'annee : ");
        int a = sc.nextInt();
      /*int jSuiv;int jPrec;int mSuiv;int mPrec;int aSuiv;int aPrec;
        if (a%4==0 && m==2) {
             if (j==29) {
                 jSuiv=1;jPrec=j-1;mSuiv=m+1;mPrec=m;aSuiv=a;aPrec=a;
             }else{
                jSuiv=1+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             };
         }else if (a%4!=0 && m==2) {
             if (j==28) {
                 jSuiv=1;jPrec=j-1;mSuiv=m+1;mPrec=m;aSuiv=a;aPrec=a;
             } else {
                 jSuiv=j+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             }
             }else if (m==4 || m==6 ||m==9 || m==11) {
             if (j==30) {
                 jSuiv=1;mSuiv=m+1;jPrec=j-1;mPrec=m;aSuiv=a;aPrec=a;
             } else {
                jSuiv=j+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             }
        }else if(m==12){
            if (j==31) {
                 jSuiv=1;mSuiv=1;jPrec=j-1;mPrec=m;aSuiv=a+1;aPrec=a;
             } else {
                jSuiv=j+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             }
        }else{ 
            if (j == 31) {
                jSuiv = 1;mSuiv = m + 1;jPrec = j - 1;mPrec=m;aSuiv=a;aPrec=a;
            } else {
                jSuiv = j + 1;jPrec = j - 1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
            }

        }
        if (a%4==0 && m==3 &&j==1) {
            jSuiv = j + 1;jPrec =29;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
        }else if (a%4!=0 && m==3 &&j==1) {
            jSuiv = j + 1;jPrec =28;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
    }else if (j==1 && m==2 || m==4 || m==6 ||m==8 ||m==9 || m==11) {
            jSuiv = j+1;jPrec =31;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
        }else if(j==1 && m==5 ||m==7 || m==12){
             jSuiv =j+1;jPrec =30;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
        }else if(j==1 && m==1) {
             jSuiv =j+1;jPrec =31;mPrec=12;aPrec=a-1;mSuiv=m;aSuiv=a;
        }
                 System.out.println("la date suivante est: "+jSuiv+"/"+mSuiv+"/"+aSuiv);
                 System.out.println("la date precedente est: "+jPrec+"/"+mPrec+"/"+aPrec);*/
                 /*dateSP();*/
                 /**********AVEC LES CLASSES DE JAVA*********** */
            LocalDate date=LocalDate.of(a, m, j);
            LocalDate hier=date.minusDays(1);
            LocalDate demain=date.plusDays(1);
            System.out.println("la date suivante est: "+demain+"\n"+"la date precedente est: "+hier);

    };     
 

    /********AVEC FONCTION*********** */
    private static String dateSP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le num du jour : ");
        int j = sc.nextInt();
        System.out.println("Entrer le num du mois : ");
        int m = sc.nextInt();
        System.out.println("Entrer le num de l'annee : ");
        int a = sc.nextInt();
      /*  int jSuiv;int jPrec;int mSuiv;int mPrec;int aSuiv;int aPrec;*/

                        /********SANS CLASSES DE JAVA******* */
       /*  if (a%4==0 && m==2) {
             if (j==29) {
                 jSuiv=1;jPrec=j-1;mSuiv=m+1;mPrec=m;aSuiv=a;aPrec=a;
             }else{
                jSuiv=1+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             };
         }else if (a%4!=0 && m==2) {
             if (j==28) {
                 jSuiv=1;jPrec=j-1;mSuiv=m+1;mPrec=m;aSuiv=a;aPrec=a;
             } else {
                 jSuiv=j+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             }
             }else if (m==4 || m==6 ||m==9 || m==11) {
             if (j==30) {
                 jSuiv=1;mSuiv=m+1;jPrec=j-1;mPrec=m;aSuiv=a;aPrec=a;
             } else {
                jSuiv=j+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             }
        }else if(m==12){
            if (j==31) {
                 jSuiv=1;mSuiv=1;jPrec=j-1;mPrec=m;aSuiv=a+1;aPrec=a;
             } else {
                jSuiv=j+1;jPrec=j-1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
             }
        }else{ 
            if (j == 31) {
                jSuiv = 1;mSuiv = m + 1;jPrec = j - 1;mPrec=m;aSuiv=a;aPrec=a;
            } else {
                jSuiv = j + 1;jPrec = j - 1;mSuiv=m;mPrec=m;aSuiv=a;aPrec=a;
            }

        }
        if (a%4==0 && m==3 &&j==1) {
            jSuiv = j + 1;jPrec =29;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
        }else if (a%4!=0 && m==3 &&j==1) {
            jSuiv = j + 1;jPrec =28;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
    }else if (j==1 && m==2 || m==4 || m==6 ||m==8 ||m==9 || m==11) {
            jSuiv = j+1;jPrec =31;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
        }else if(j==1 && m==5 ||m==7 || m==12){
             jSuiv =j+1;jPrec =30;mPrec=m-1;mSuiv=m;aSuiv=a;aPrec=a;
        }else if(j==1 && m==1) {
             jSuiv =j+1;jPrec =31;mPrec=12;aPrec=a-1;mSuiv=m;aSuiv=a;
        }
                 return ("la date suivante est: "+jSuiv+"/"+mSuiv+"/"+aSuiv)+"\n"+
                 ("la date precedente est: "+jPrec+"/"+mPrec+"/"+aPrec);
                
    }*/
    
    LocalDate date=LocalDate.of(a, m, j);
    LocalDate hier=date.minusDays(1);
    LocalDate demain=date.plusDays(1);
    return ("la date suivante est: "+demain+"\n"+"la date precedente est: "+hier);
    
        
 }
}
