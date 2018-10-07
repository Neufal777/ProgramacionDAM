public class Exne{

  public static void main(String[] args){
      //Crea variables anomenades hora, minut i segon i assigna a cadascuna els valors corresponents a l’hora actual.
        int hora = 16;
        int minut = 20;
        int segon = 56;

        //Mostrem l'hora actual
        System.out.println("Hora actual : " + hora + ":" + minut + ":" + segon);
        // Calcula i mostra el nombre de segons des de mitja nit.
        //calculem els egons que te un dia, llavors
        int segonsMitjaNit = (23 * 3600) + (59 * 60 ) + 60 ;

        //calculem els segons que portem des de mija nit fins l'hora actual (FMA = Fins moment actual )
        int segonsFMA = (16 * 3600) + (20 * 60) + 56 ;

        //calcula dels segoms restants perque acabi el dia

        int segonsRestantsFinalDia = segonsMitjaNit - segonsFMA;

        //mostrem els resultat que falten perque acabi el dia
        System.out.println("Falten " + segonsRestantsFinalDia + " segons perque acabi el dia");

        //calculem el percentatge del dia que ha passat

        // si 86.460 segons son el 100% del dia, per trobar X% del dia hem de fer

        double percentatgeDelDia = (segonsFMA * 100) / segonsMitjaNit;

        //Resultat del % que portem de dia
        System.out.println("portem el " + percentatgeDelDia + "%" );
  }
}
