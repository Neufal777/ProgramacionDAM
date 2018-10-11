import java.util.Scanner;
//
// (*) Escriu un programa que demani una quantitat de segons i els converteixi en hores, minuts i segons.
//
// Introdueix el nombre de segons a convertir: 5600
// 5600 segons equivalen a 1 hores 33 minuts 20 segons
//

public class Consola3_1{

  public static void main(String[] args){

      //primer de tot declarem les variables
      int segonsUsuari;
      int hores;
      int minuts;
      int segons;

      //creem el nou objecte
      Scanner informacio = new Scanner(System.in);

      //missatge que demana els numeros
      System.out.print("Introdueix el nombre de segons a convertir: ");

      //guardem la informacio en la variable corresponent
      segonsUsuari =  informacio.nextInt();

      //separem en hores, minuts i segons
      hores = segonsUsuari / 3600;
      int residuHores = segonsUsuari % 3600;

      minuts = residuHores / 60;
      int residuMinuts = residuHores % 60;

      segons = residuMinuts;

      System.out.println("hores : " + hores + " minuts " + minuts + " segons "+ segons );


  }
}
