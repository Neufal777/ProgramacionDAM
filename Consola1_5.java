import java.lang.Math.*;
import java.util.Scanner;

//
//
// 5 - Escriu un programa que llegeixi el radi i l’alçada d’un cilindre i en calculi el volum utilitzant la següent fórmula:
//
// area = radi * radi * pi
//
// volum = area * alçada
//
// Entra el radi i l'alçada del cilindre: 5.5 12
// L'àrea és 95.0331
// El volum és 1140.4
//


public class Consola1_5{

  public static void main(String[] args){

    //Valor de pi s'obte amb Math.PI

    //Aqui declarem les variables dels valors que introduira l'usuari
    double radi,altura,area,volum;


    //inicialitzem l'objecte que ens permetra obtenir els valors de l'usuari (input)
    Scanner infor = new Scanner(System.in);

    //Mostrem un missatge en el qual demanem a l'usuari que introdueixi les dades
    System.out.print("Entra el radi i l\'alçada del cilindre: ");

    radi = infor.nextDouble();
    altura = infor.nextDouble();

    //un cop obtingudes les dades fem els calculs
    area = radi * radi * Math.PI;
    volum = area * altura;

    //un cop fets els calculs, mostrem les dades

    System.out.println("Area : " + area);
    System.out.println("El volum es : " + volum);
  }
}
