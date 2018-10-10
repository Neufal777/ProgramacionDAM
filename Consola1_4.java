
/*
4 -
(!!!) Modifica l’exercici anterior invertint la petició de dades, és a dir, demana en primer lloc
l’edat i en segon lloc el nom. Et trobaràs un problema inesperat explica per què es dona i busca una solució.
*/
import java.util.Scanner;

public class Consola1_4{

  public static void main(String[] args){

      String nom;
      int edat;

      Scanner obtenirInfo = new Scanner(System.in);

      //demana primer a l'usuari la seva edat
      System.out.print("Quants anys tens ? ");

      edat = obtenirInfo.nextInt();

      System.out.print("tens " + edat + " anys , com et dius ? ");

      nom = obtenirInfo.next();

      //mostra el resultat final dels valors obtinguts de l'usuari

      System.out.println("Aixi que et dius " + nom + " i tens " + edat + " anys" );

  }
}


// l'error esta en que no ens deixa posar el nom, ho podem solucionar posant next en comptes de nextLine al final :)
