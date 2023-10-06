import java.util.ArrayList;
import java.util.Random;
public class Parcial {



    public static void main(String[] args) {
        
        Random random = new Random();
       
        int nroHoteles = random.nextInt(7) +1; // cantidad hoteles


        System.out.println("el numero de hoteles es " + nroHoteles);
        for(int i=0; i<nroHoteles;i++){
            int tipoLuces = random.nextInt(3) + 1;// tipo de luces por hotel
            int numeroHoras = random.nextInt(24)+ 1;//cantidad de horas aleatorias.

            System.out.println("cantidad de horas encendidas en hotel " + (i+1) + " son " + numeroHoras);// imprime la cantidad de hoteles
            if(tipoLuces == 1){// el ciclo recorre los tipos de luces por hotel, en este caso cuando es el tipo de luz 1
                System.out.println("el hotel " + (i+1) + " gasta en luces " + (numeroHoras*0.25));// imprime el gasto del hotel (i+1)
            }
            if(tipoLuces == 2){// el ciclo recorre los tipos de luces por hotel, en este caso cuando es el tipo de luz 2
                System.out.println("el hotel " + (i+1) + " gasta en luces " + (numeroHoras*0.75));
            }
            if(tipoLuces == 3){// el ciclo recorre los tipos de luces por hotel, en este caso cuando es el tipo de luz 3
                System.out.println("el hotel " + (i+1) + " gasta en luces " + (numeroHoras*1));
            }
            

        
        
            
        }








        
    }
    
}
