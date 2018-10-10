
// 3- Fes un programa que demani el nom i l’edat i mostri un missatge de benvinguda. (1) demana el nom. (2) demana l’edat (3) mostra un missatge com a l’exemple. La sortida del programa ha de ser exactament igual a la proposada:
//
// Hola. Com et dius? Pere
//
// Hola Pere. Quants anys tens? 12
//
// Així que et dius Pere i tens 12 anys.


import java.util.Scanner;

public class Consola1_3{

  public static void main(String[] args){

      String nom;
      int edat;

      Scanner obtenirInfo = new Scanner(System.in);

      //demana primer a l'usuari el seu nom
      System.out.print("Hola, com et dius ? ");

      nom = obtenirInfo.nextLine();

      System.out.println("Hola " + nom + " quants anys tens ? ");

      //guardem el valor de la edat en la variable edat

      edat = obtenirInfo.nextInt();

      //mostra el resultat final dels valors obtinguts de l'usuari

      System.out.println("Aixi que et dius " + nom + " i tens " + edat + " anys" );

  }
}
