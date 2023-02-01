import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Ejercicio20V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        matriz(mat);
        Magica(mat);
    }

    public static void Magica(int[][] mat) {
        int cont = 0;
        int Comparador, aux2;
        Comparador = 0;

        for (int i = 0; i < mat.length; i++) {
            Comparador = mat[i][i] + Comparador;
        }

        aux2 = 0;
        for (int i = 0; i < mat.length; i++) {
            aux2 = aux2 + mat[i][(mat.length-1)- i];
        }

        if (Comparador != aux2) {
            cont = cont + 1;
        }

        for (int[] mat1 : mat) {
            aux2 = 0;
            for (int j = 0; j < 3; j++) {
                aux2 = aux2 + mat1[j];
            }
            if (Comparador != aux2) {
                cont = cont + 1;
            }
        }

        for (int j = 0; j < mat.length; j++) {
            aux2 = 0;
            for (int i = 0; i < 3; i++) {
                aux2 = aux2 + mat[i][j];
            }
            if (Comparador != aux2) {
                cont = cont + 1;
            }
        }
        
        if(cont==0){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
        
    }

    public static void matriz(int[][] mat) {
        Scanner valor = new Scanner(System.in);
        for (int[] mat1 : mat) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor: ");
                mat1[j] = valor.nextInt();
            }
        }
        for (int[] mat1 : mat) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + mat1[j] + "]");
            }
            System.out.println();
        }
    }
}