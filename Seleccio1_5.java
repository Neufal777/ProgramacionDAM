// Escriu un programa que demani un número enter entre 0 i 99999 i digui quantes xifres té. Si El nombre entrat esta fora del rang demanat cal mostrar un error i sortir del programa.

import java.util.Scanner;

public class Seleccio1_5{

  public static void main(String[] args){

    //variables
    int numeroUsuari;

    //nou objecte
    Scanner info1_5 = new Scanner(System.in);

    //mostrem un missatge per l'usuari
    System.out.print("Introdueix un numero del 0 al 99999 : ");

    //guardem el numero obtingut
    numeroUsuari = info1_5.nextInt();

    if(numeroUsuari > 0 && numeroUsuari < 99999){

      //correcte

      //busquem el nuemero de les xifres
      int longitud = String.valueOf(numeroUsuari).length();

      //mostrem el resultat, es a dir, les xifres que te el numero introduit
      System.out.println("XIFRES : " + longitud);

    }else{

      System.out.println("El numero introduit no es correcte");
    }


  }
}
