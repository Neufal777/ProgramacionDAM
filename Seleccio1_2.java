// Escriu un programa que demani un número i indiqui si és positiu o negatiu.

import java.util.Scanner;

public class Seleccio1_2{

  public static void main(String[] args){

    int num;

    Scanner info1_2 = new Scanner(System.in);

    System.out.print("Escriu un numero : ");

    num = info1_2.nextInt();

    //verifiquem si el numero es positiu

    if(num > 0){

      System.out.println("Aquest numeor es positiu");

    }else{

      System.out.println("Aquest numero es negatiu ");
    }


  }
}
