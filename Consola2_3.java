import java.util.Scanner;

// (*) Demana a l’usuari diverses dades i mostra la informació en una taula com la proposada.
//
// Consideracions:
//
//     El codi de referència pot contenir lletres i nombres.
//
//     Un euro equival a 166 pessetes.
//
//     El resultat en pessetes el volem sense decimals
//
//     Per favor introdueix la següent informació:
//     Nom de producte: Xiclet
//     Unitats en estoc: 300
//     Preu: 0,1
//     Codi de referència: XCL0001
//
//     +-------------------------------+
//     |Xiclet         |        XCL0001|
//     +-------------------------------+
//     |        Estoc: |    300 unitats|
//     | Import:       |               |
//     |         0,10 €|    17 pessetes|
//     +-------------------------------+
//

public class Consola2_3{

  public static void main(String[] args){

    //declarem les variables
    String nomProducte;
    int stoc;
    double preu;
    String codi;
    double pessetes ;

    //nou objecte de la classe Scanner
    Scanner obtenir = new Scanner(System.in);

    //missatge per demanar les dadesç
    System.out.println("Per favor introdueix la següent informació:");

    //nom del producte
    System.out.print("Nom producte : ");
    nomProducte = obtenir.nextLine();

    //Unitats en estoc
    System.out.print("Unitats en estoc : ");
    stoc = obtenir.nextInt();

    //Preu
    System.out.print("Preu : ");
    preu = obtenir.nextDouble();

    //codi de referencia
    System.out.print("Codi de referencia : ");
    codi = obtenir.next();


    //Conversio de euros a pessetes
    pessetes = preu * 166;

    //un cop hem obtingut la informacio procedim a mostrarla en pantalla en el format especificat

    System.out.printf("%n%s","+-------------------------------+");
    System.out.printf("%n|%s%4s|",nomProducte,"");
    System.out.printf("%18s|",codi);
    System.out.printf("%n%s","+-------------------------------+");

    //primera linia
    System.out.printf("%n|%12s|","Estoc:","");
    System.out.printf("%10s unitats|",stoc);

    //segona linia
    System.out.printf("%n|%s%5s|","Import:","");
    System.out.printf("%18s|","");

    //tercera linia
    System.out.printf("%n|%10s €|",preu,"");
    System.out.printf("%9s pessetes|",pessetes);

    System.out.printf("%n%s","+-------------------------------+");
  }
}
