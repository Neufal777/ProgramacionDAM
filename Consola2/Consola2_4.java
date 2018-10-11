import java.util.Scanner;
/*

Escriu un programa que demani un codi ASCII, entre 0 i 127, i mostri la seva representació.

 Introdueix un codi ASCII: 65

 El caràcter és: A

*/


public class Consola2_4{

  public static void main(String[] args){

    //declaracio de variables necessaries
    int codiUsuari;


    //demanar a l'usuari un numero del 0 al 127
    Scanner obt = new Scanner(System.in);

    //mostrar el missatge
    System.out.print("Introdueix un numero del 0 al 127 ");

    codiUsuari = obt.nextInt();

    //verificar si el numero es mes gran que 127

    if(codiUsuari <= 127){

      //si el numero es mes petit o igual que 127

      //Mostre la representació ASCII del numero entre 0 i 127 introduit

      System.out.printf("%c %n",codiUsuari);

    }else{

      System.out.println("El numero introduit es mes gran que 127, introdueix algun que sgui mes petit o igual");
    }
  }
}
