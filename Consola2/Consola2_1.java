import java.util.Scanner;
//
// Escriu un programa que demani dos nombres enters a l’usuari mostri la seva suma amb el format següent: (Considera que com a molt els nombres tindran 5 dígits)
//
//   3424
// +  999
// -------
//   4423
//

public class Consola2_1{

  public static void main(String[] args){

    //declarem les variables necessaries
    int num1, num2, suma;
    String linias = "-------";
    //creem un nou objecte
    Scanner info = new Scanner(System.in);

    //primer de tot demanem els dos nombres enters
    System.out.print("Escriu dos numeros : ");

    //guardarem el resultat en les variables corresponents
    num1 = info.nextInt();
    num2 = info.nextInt();


    //fem la suma del dos nombres
    suma = num1 + num2;


    //un cop tenim la informacio, mostrem el resultat

    System.out.printf("%8d %n",num1);
    System.out.printf(" +%6d %n",num2);
    System.out.printf("%8s %n", linias);
    System.out.printf("%8d %n",suma);

  }
}
