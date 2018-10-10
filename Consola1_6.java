// 6- Escriu un programa que demani tres números enters a l’usuari, els sumi, divideixi el resultat entre 2 i mostri el resultat amb decimals.

import java.util.Scanner;

public class Consola1_6{

  public static void main(String[] ar4gs){

    //declaracio de variables
    int numero1, numero2, numero3, suma, resultat;

    Scanner infor = new Scanner(System.in);

    // mostrar un missathe a l'usuari perque ens dongui els numeros

    System.out.print("Dona\'m 3 numeros  : ");

    numero1 = infor.nextInt();
    numero2 = infor.nextInt();
    numero3 = infor.nextInt();


    //fem la suma dels numeros introduits
    suma = numero1 + numero2 + numero3;

    //ara farem la divisio entre 2 (X/2) de la suma per posteriorment mostrar-los en pantalla

    resultat = suma / 2;

    //mostrem el resultat de la suma i divisio entre 2 dels numeros introduits per l'usuari

    System.out.println("Resultat : " + resultat);

  }
}
