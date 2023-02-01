import java.util.Scanner;
public class Ejercicio17 {
		public static void main(String[] args) {
            Scanner valor = new Scanner(System.in);
            System.out.println("Ingrese el tamaño del array");
            int dimension = valor.nextInt();
            int[] arreglo = new int[dimension];
            System.out.println();
            llenar(arreglo);
            Digitos(arreglo);

		}
 
 public static void Digitos(int[] arreglo) {
        int longitud;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < arreglo.length-1; i++) {
            String numCadena = String.valueOf(arreglo[i]);
            longitud = (int) numCadena.length();
            switch (longitud) {
                case 1:
                    cont1 = cont1 + 1;
                    break;
                case 2:
                    cont2 = cont2 + 1;
                    break;
                case 3:
                    cont3 = cont3 + 1;
                    break;
                case 4:
                    cont4 = cont4 + 1;
                    break;
                case 5:
                    cont5 = cont5 + 1;
                    break;
             }
        }
        System.out.println();
        System.out.println("numeros de 1 digito: "+cont1);
        System.out.println("numeros de 2 digito: "+cont2);
        System.out.println("numeros de 3 digito: "+cont3);
        System.out.println("numeros de 4 digito: "+cont4);
        System.out.println("numeros de 5 digito: "+cont5);
    }

 public static void llenar(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++) {
                arreglo[i] = (int)(Math.random() * 99999);
        }
        for (int i = arreglo.length-1; i >=0; i--) {
            System.out.print(arreglo[i]+",");
        }      
        }

}