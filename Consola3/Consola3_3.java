
// BenFrescos.com ven ous ecològics a través de la seva pàgina Web. Una dotzena d’ous valen 3.25 euros i un ou individual val 45 cèntims.
//
// Escriu un programa que demani a l’usuari el nombre d’ous que vol comprar i mostri l’import total indicant clarament el desglòs dels imports.
//
// Quants ous vol comprar? 25
//
// Dotzenes: 2 a 3.25€
// Unitats: 1 a 0.45€
// Import total: 6.95€
//

import java.util.Scanner;

public class Consola3_3{

  public static void main(String[] args){

    //variables
    double ousUsuari;
    double preuDotzena = 3.25;
    double preuIndividual = 0.45;
    double numDotzenes;
    double numUnitats;
    double preuFinal;
    //primer de tot hem de demanar a l'usuari els ous que vol

    Scanner informacio3 = new Scanner(System.in);

    //un cop tenim la informacio, la guardem a la variable ousUsuari

    System.out.print("Quants Ous vols comprar ? ");

    ousUsuari = informacio3.nextDouble();

    //fem els calculs per veure quantes dotzenes haura de comprar i quan li costara

    numDotzenes = ousUsuari / 12;

    numUnitats = ousUsuari % 12;

    //un cop tenim el numero de dotzenes i unitats calculem el preu

    preuFinal = ((numDotzenes * preuDotzena)+(numUnitats * preuIndividual));

    System.out.println("Dotzenes : " + numDotzenes);
    System.out.println("Unitats : " + numUnitats);
    System.out.println("Import Total : " + preuFinal +" €");


  }
}
