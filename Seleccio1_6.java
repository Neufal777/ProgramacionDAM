// Fes un programa que demani tres nombres i digui si són tots iguals, si són tots diferents o ni una cosa ni l’altre.

import java.util.Scanner;

public class Seleccio1_6{

  public static void main(String[] args){

    //variables
    int num1,num2,num3;

    Scanner info1_6 = new Scanner(System.in);

    //missatge demanant els numeros

    System.out.print("Introdueix 3 numeros : ");

    num1 = info1_6.nextInt();
    num2 = info1_6.nextInt();
    num3 = info1_6.nextInt();

    //un cop tenim els numeros  podem començar a fer les comparacions

    if(num1 == num2 && num1 == num3 && num2 == num3){

      System.out.println("Tots son iguals");

    }else if(num1 != num2 && num1 != num3 && num2 != num3){

      System.out.println("Tots els numeros son diferents");

    }else{

      System.out.println("No son ni tots iguals ni tots diferents");
    }
  }
}
