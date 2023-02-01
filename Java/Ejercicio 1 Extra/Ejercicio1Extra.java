import java.util.Scanner;

public class Ejercicio1Extra {

  
    public static void main(String[] args) {
      Scanner valor=new Scanner(System.in);
      System.out.println("Ingrese la cantidad de minutos");
      int min=valor.nextInt();
      Calcular(min);
      
    }
    
 public static void Calcular(int min){
     // un dia es 1400 minutos
     double dia,hora,aux;
     dia=min/1440;
     aux=min%1440;
     System.out.println("resto "+aux);
     hora=aux/60;
     System.out.println("dia(s) "+dia+" hora(s)"+hora);
 } 
    
}
