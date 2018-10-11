public class Operadors2_4{

  public static void main(String[] args){


        //s'estableixen les variables

        int numVals = 15;
        int preuXoco = 10;
        int preuXiclet = 3;
        int xocoObtenido = 0;
        int xicleObtenido = 0;



              while(numVals != 0){

                /*
                si el numero de vals no es 0 haz esto
                1- mira si al menos tenemos 10 vales para una xocolatina
                */



                if(numVals >= 10){

                  xocoObtenido++;
                  numVals -= 10;

                }else if (numVals >= 3 ) {

                  //si no tenim 10 vals per xocolatines, canviem 3 vals per xiclet

                  xicleObtenido++;
                  numVals -= 3;

                }else if(numVals != 3 && numVals != 10){

                  //quan no podem agafar ni xocolates ni xiclets
                  break;

                }
              }

        System.out.println("xoco : "+xocoObtenido);
        System.out.println("xiclets : "+xicleObtenido);
        System.out.println("Ens sobren " + numVals +" Vals");
  }
}
