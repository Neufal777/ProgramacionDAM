// 2- Fes un programa que demani una quantitat de graus Celsius i en mostri la conversió a graus Fahrenheit.
//
// La fòrmula per a la conversió és : fahrenheit = (9 / 5) * celsius + 32.
// Entra una temperatura en graus Celsisus: 43
// 43 graus Celsius equivalen a 109.4 graus Fahrenheit

import java.util.Scanner;

public class Consola1_2{

  public static void main(String[] args){

    double celsius;
    double farenheits;

    //primer de tot, demanem el valor dels celsius al usuari

    Scanner valorArebre = new Scanner(System.in);

    System.out.println("Valor en celsius : ");

    celsius = valorArebre.nextDouble();

    //aqui farem la conversio a farenheits

    farenheits = (1.80 * celsius) + 32;

    //finalment, mostrem el resultat

    System.out.println(celsius + " Celsius equivalen a : " + farenheits + " farenheits");

  }
}
