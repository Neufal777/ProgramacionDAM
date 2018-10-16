// Escriu un programa que demani dos números a l’usuari i indiqui si els dos números són iguals o no.

import java.util.Scanner;

public class Seleccio1_1{

  public static void main(String[] args){

    //variables
    int numUsuari1, numUsuari2;

    Scanner info = new Scanner(System.in);

    //demanem els numeros al usuari

    System.out.print("Escriu dos numeros : ");

    numUsuari1 = info.nextInt();
    numUsuari2 = info.nextInt();

    //un cop tenim els dos numeros fem la comparacio

    if(numUsuari1 == numUsuari2){

      System.out.println("Els dos numeros son iguals");

    }else{

      System.out.println("Els numeros son diferents ");
    }

  }
}
