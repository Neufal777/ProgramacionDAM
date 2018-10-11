import java.util.Scanner;

// 2- Escriu un programa que demani tres noms propis i els mostri en una taula, d’amplada fixa, semblant a la següent:
//
// +--------------------------------------------------+
// | 1 |                                       Andreu |
// | 2 |                                        Jordi |
// | 3 |                                         Pere |
// +--------------------------------------------------+
//

public class Consola2_2{

  public static void main(String[] args){

    //variables
    String nom1,nom2,nom3;

    //nou objecte
    Scanner info = new Scanner(System.in);

    //missatge per demanar la informacio
    System.out.print("Posa el primer nom: ");

    //assignem els valors introduits a les variables corresponents
    nom1 = info.nextLine();

    System.out.print("Posa el segon nom: ");

    //assignem els valors introduits a les variables corresponents
    nom2 = info.nextLine();

    System.out.print("Posa el tercer nom: ");

    //assignem els valors introduits a les variables corresponents
    nom3 = info.nextLine();



    //el proxim pas es fer la taula i alinear els noms amb els numeros

    System.out.printf("%s","+--------------------------------------------------+");
    System.out.printf("%n| 1 |");
    System.out.printf("%46s|",nom1);
    System.out.printf("%n| 2 |");
    System.out.printf("%46s|",nom2);
    System.out.printf("%n| 3 |");
    System.out.printf("%46s|%n",nom3);
    System.out.printf("%s%n","+--------------------------------------------------+");
  }
}
