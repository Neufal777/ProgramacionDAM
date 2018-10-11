import java.util.Scanner;

// (*) Escriu un programa que demani un enter entre 0 i 1000 i sumi tots els digits de l’enter. Per exemple, si l’enter és 923 la suma de tots els seus dígits és 14.
//
// Pista: Utilitza l’operador % per extreure els dígits i l’operador / per eliminar els dígits ja tractats. Per exemple, 932 % 10 = 2 i 932 / 10 = 93.
//
// Entra un número entre 0 i 1000: 326
// La suma dels seus dígits és 11
//

public class Consola3_2{

  public static void main(String[] args){

    //variables
    int numUsuari, suma, desc1, desc2, desc3, desc4;

    //nou objecte que ens permetra obtenir la informacio
    Scanner informacio2 = new Scanner(System.in);

    //mostra el missatge
    System.out.print(" Entra un numero entre el 0 i el 1000 ");

    //guardem el numero de l'usuari
    numUsuari = informacio2.nextInt();

    //comprovem si el numero que ha introduit l'usuari esta entre el 0 i el 1000

    if(numUsuari >= 0 && numUsuari <= 1000){

      //fem les operacions necessaries

      //descomposem els nombres per despres poder sumarlos

      desc1 = numUsuari % 10;

      desc2 = numUsuari/10;

      desc3 = desc2 % 10;

      desc4 = desc2 - desc3;
      desc4 /= 10;


      //per obtenir el resultat final nomes hem de sumar les 3 descomposicions

      suma =  desc1 + desc3 + desc4;

      System.out.println("La suma de la descomposicio es : " + suma);

    }else{

      //el numero introduit no compleix amb les condicions
      System.out.println("El numero introduit no esta entre el 0 i el 1000 :) ");
    }

  }
}
