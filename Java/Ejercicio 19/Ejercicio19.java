
import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        */
        
        int[][] mat = new int[3][3];
        int[][] matTras = new int[3][3];
        matriz(mat);
        System.out.println();
        Traspuesta(mat, matTras);
        Antisimetrica(mat,matTras);
    }
    public static void Antisimetrica(int[][] mat,int[][] matTras){
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if(matTras[i][j]*-1 != mat[i][j]){     
                        cont=cont+1;
            }
        }
    }
        if(cont==0){
            System.out.println("Matriz antisimetrica");
        }else{
            System.out.println("No es antisimetrica");
        }
   }
    
    public static void Traspuesta(int[][] mat,int[][] matTras){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 3; j++) {
                matTras[j][i] = mat[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matTras[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static void matriz(int[][] mat) {
        Scanner valor = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor: ");
                mat[i][j] = valor.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println();
        }
    }
}
