// 1- Fes un programa que demani una quantitat de polzades a l’usuari i mostri la conversió d’aquestes polzades a centímetres. (1 in = 2,54 cm)

import java.util.Scanner;

public class Consola1_1{

  public static void main(String[] args){

    double polzades;
    double conversioPaC; //contindra la conversio de polzades a centimentres

    Scanner rebre = new Scanner(System.in);

    System.out.print("Introdueix la quantitat en polzades : ");
    polzades = rebre.nextDouble();
    conversioPaC = polzades * 2.54;

    //mostra en pantalla el resultat

    System.out.println(polzades + " in = " + conversioPaC + " cm");



  }
}
