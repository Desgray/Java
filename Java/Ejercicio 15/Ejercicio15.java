import java.util.Scanner;
public class Ejercicio15 {
		public static void main(String[] args) {
            int [] arreglo = new int[100];
            llenar(arreglo);
		}
 
 public static void llenar(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++) {
                arreglo[i]=i;
        }
        for (int i = arreglo.length-1; i >=0; i--) {
            System.out.println(arreglo[i]);
        }      
        }

}