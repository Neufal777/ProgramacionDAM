// Una agència de viatges ven bitllets d’avió i altres serveis relacionats. Els dependents de l’agència sovint s’equivoquen a l’hora d’introduir els codis dels bitllets i et demanen fer una aplicació que comprovi si el codi entrat per un bitllet és vàlid o no.
//
// Els codis dels bitllets són números de sis xifres amb la particularitat que si se’n elimina la última xifra i es divideix el nombre resultant per 7 el residu de la divisió és exactament igual a la xifra retirada.
//
// L’aplicació ha de demanar el codi del bitllet i ha de verificar si és un codi correcte o no mostrant vàlid en el primer cas i invàlid en el segon.


import java.util.Scanner;

public class Seleccio1_4{

  public static void main(String[] args){

    //variables
    int codiBitllet;
    int numeroXifres = 7;
    int ultimaXifra;
    int senseUltimaXifra;
    Scanner info1_4 = new Scanner(System.in);

    //guardem el numero del bittlet
    codiBitllet = info1_4.nextInt();

    //verifiquem que el codi es valid
    senseUltimaXifra = codiBitllet / 10;

    //ultima xifra
    ultimaXifra = codiBitllet % 10;

    //comprovar si el codi del bitllet es valid o no
    if(senseUltimaXifra % 7 == ultimaXifra){

      System.out.println("VALID");

    }else{

      System.out.println("NO VALID");

    }



  }
}
