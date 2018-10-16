import java.util.Scanner;

public class Seleccio1_3{

  public static void main(String[] args){

    //variables

    int num1,num2;

    Scanner info1_3 = new Scanner(System.in);

    //demanem els numeros
    System.out.print("Posa dos numeros per veure si son multiples ");

    num1 = info1_3.nextInt();
    num2 = info1_3.nextInt();

    //un cop guardades les dades, les analitzem

    if(num1 % num2 == 0 || num2 % num1 == 0){

      //un es multiple de l'altre
      System.out.println("Un dels numeros es multiple de l'altre");

    }else{

      //cap es multiple de l'altre
      System.out.println("ningun dels dos es multiple de l'altre");
    }

  }
}
